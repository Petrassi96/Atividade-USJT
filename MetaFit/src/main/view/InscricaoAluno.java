package main.view;

import main.controller.AlunoController;
import main.controller.AlunoTreinoController;
import main.controller.TreinoController;
import main.model.Aluno;
import main.model.Professor;
import main.model.Treino;

import javax.swing.*;

import java.awt.event.MouseEvent;
import java.io.File;
import java.awt.event.MouseAdapter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.Objects;

public class InscricaoAluno implements ActionListener {
    private JButton inscricao;
    private JTextArea instrucoes;
    private JTextArea objetivo;
    private JTextArea treino;
    private JLabel especialidadeTreinos; 
    private  Aluno aluno;
    private String idTreino;
    JFrame frame = new JFrame("Inscrição");
    //Criando
    public InscricaoAluno(String idTreino, Aluno aluno) {
        this.aluno = aluno;
        this.idTreino = idTreino;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 800);  
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        // Layout nulo para posicionamento manual
        frame.setLayout(null);

         //definindo botão
    inscricao = new JButton("Increver-se");
    inscricao.setBounds(500,710,326,46);
    //jlabel

    especialidadeTreinos = new JLabel("Especialidade do Treino");
    especialidadeTreinos.setBounds(460, 30, 500, 30);
    especialidadeTreinos.setFont(new Font("Arial", Font.BOLD, 34));
    especialidadeTreinos.setForeground(new Color(50, 234, 216));



    objetivo = new JTextArea("Objetivo:");  
    objetivo.setBounds(50, 99, 500, 100); 

    instrucoes = new JTextArea("Instruções:");  
    instrucoes.setBounds(50, 250, 300, 300); 

    treino = new JTextArea("Treino:");  
    treino.setBounds(700, 99, 500, 600); 
    
    // Ajustando a imagem de fundo
   ImageIcon imagemFundo = new ImageIcon("src/main/view/img/RegistroTreino.png");  //caminho da imagem
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

        inscricao.addActionListener(this);

        frame.add(inscricao);
        frame.add(objetivo);
        frame.add(instrucoes);
        frame.add(treino);
        frame.add(especialidadeTreinos);

        frame.add(imageLabel);
        frame.add(fundo);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == inscricao) {
            AlunoTreinoController alunoTreinoController = new AlunoTreinoController();

            if (alunoTreinoController.cadastrarAlunoEmTreino(aluno.getId(), idTreino)){
                JOptionPane.showMessageDialog(frame, "Aluno cadastrado com sucesso!");
            }else {
                JOptionPane.showMessageDialog(frame, "Não foi possivel cadastrar aluno!\nverifique se você já esta cadastrado nesse treino","Erro",JOptionPane.ERROR_MESSAGE);
            }

        }
    }
}
