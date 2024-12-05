package main.view;

import main.controller.AlunoController;
import main.model.Aluno;

import javax.swing.*;

import java.awt.event.MouseEvent;
import java.io.File;
import java.awt.event.MouseAdapter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MetasAluno implements ActionListener {

private JButton addMeta;
private JTextField metaAtual;
private Aluno aluno;
JFrame frame = new JFrame("Metas");

public MetasAluno(Aluno aluno){
    this.aluno = aluno;

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1280, 800);  
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);
    // Layout nulo para posicionamento manual
    frame.setLayout(null);
    String meta = (aluno.getPesoMeta() != 0 ? ""+aluno.getPesoMeta() : "");
    //definindo JTextField
    metaAtual = new JTextField("Peso Atual: "+aluno.getPeso()+"| MDP:"+meta);
    metaAtual.setBounds(256, 400, 471, 71);  
    

    frame.add(metaAtual);

    //definindo botões
    addMeta = new JButton("Registrar nova Meta");
    addMeta.setBounds(256, 490, 471, 71);

    frame.add(addMeta);

    addMeta.addActionListener(this);

    // Ajustando a imagem de fundo
    ImageIcon imagemFundo = new ImageIcon("src/main/view/img/MetasAluno.png");  //caminho da imagem
    Image imagem = imagemFundo.getImage();
    Image imagemRedimensionada = imagem.getScaledInstance(frame.getWidth(), frame.getHeight(), Image.SCALE_SMOOTH);
    imagemFundo = new ImageIcon(imagemRedimensionada);

    // Definir a imagem de fundo no frame
    JLabel fundo = new JLabel(imagemFundo);
    fundo.setBounds(0, 0, frame.getWidth(), frame.getHeight());  // Faz a imagem ocupar toda a janela

    //Criando o método voltar
      ImageIcon voltarIcon = new ImageIcon("src/main/view/img/VOLTAR.png");
      Image voltar = voltarIcon.getImage().getScaledInstance(150, 40, Image.SCALE_SMOOTH);

      // Criar um JLabel com a imagem
      JLabel imageLabel = new JLabel(new ImageIcon(voltar));
      imageLabel.setBounds(90, 10, 150, 100); // Posição (x, y) e dimensões (largura, altura)

      imageLabel.addMouseListener(new MouseAdapter() 
        {
            public void mouseClicked(MouseEvent e) 
            {
                frame.dispose();
                new HomeAluno(aluno);
            }
        });

        frame.add(imageLabel);
        frame.add(fundo);
    
    
     // Exibir o frame
   frame.setVisible(true);
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addMeta) {
            String texto = metaAtual.getText();
            if (texto.contains("MDP:")) {
                String[] partes = texto.split("MDP:");
                if (partes.length > 1) {
                    String metaDigitada = partes[1].trim();
                    try {
                        double numeroMeta = Double.parseDouble(metaDigitada);
                        AlunoController alunoController = new AlunoController();
                        aluno.setPesoMeta(numeroMeta);
                        alunoController.atualizar(aluno);
                        JOptionPane.showMessageDialog(frame, "Meta de peso atualizada com sucesso!");
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Por favor, insira um número válido após 'MDP:'");
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Digite sua meta após 'MDP:'");
                }
            } else {
                JOptionPane.showMessageDialog(frame, "Formato inválido. Certifique-se de incluir 'MDP:' no texto.");
            }

        }
}
}
