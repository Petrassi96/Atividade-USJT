package main.view;

import main.controller.AlunoTreinoController;
import main.model.Aluno;
import main.model.Treino;

import javax.swing.*;

import java.awt.event.MouseEvent;
import java.io.File;
import java.awt.event.MouseAdapter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class TreinosAluno implements ActionListener {
    private JButton bttreinos;
    private JButton btconfiguracao;
    private JButton btmetas;
    private JButton btsair;
    private Aluno aluno;
    JFrame frame = new JFrame("Treinos");
     //Criando
     public TreinosAluno(Aluno aluno) {
         this.aluno = aluno;

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 800);  
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        // Layout nulo para posicionamento manual
        frame.setLayout(null);

       //definindo os botões
       bttreinos = new JButton("Treinos");
       bttreinos.setBounds(20, 400, 326, 46);

       btconfiguracao = new JButton("Configurações");
       btconfiguracao.setBounds(20, 450, 326, 46);

       btmetas = new JButton("Metas");
       btmetas.setBounds(20, 500, 326, 46);

       btsair = new JButton("Sair");
       btsair.setBounds(80, 550, 199, 46);

         AlunoTreinoController alunoTreinoController = new AlunoTreinoController();
         ArrayList<Treino> treinos =  alunoTreinoController.listarTreinosPorAluno(aluno.getId());

         int yPosition = 400; // Posição inicial dos botões
         for (Treino treino : treinos) {
             JButton button = new JButton(treino.getNomeTreino());
             button.setBounds(500, yPosition, 199, 46);
             frame.add(button);

             button.addActionListener(new ActionListener() {
                 @Override
                 public void actionPerformed(ActionEvent e) {
                  frame.dispose();
                  new VisualizarTreinoAluno(aluno,treino.getId());
                 }
             });

             yPosition += 50;
         }


         //adicionando os botões
       frame.add(bttreinos);
       frame.add(btconfiguracao);
       frame.add(btmetas);
       frame.add(btsair);

       bttreinos.addActionListener(this);
       btconfiguracao.addActionListener(this);
       btmetas.addActionListener(this);
       btsair.addActionListener(this);

       // Ajustando a imagem de fundo
    ImageIcon imagemFundo = new ImageIcon("src/main/view/img/treinosAluno.png");  //caminho da imagem
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
        if (e.getSource() == bttreinos) {
            frame.dispose();
            new TreinosAluno(aluno);
        }
        if (e.getSource() == btconfiguracao) {
            frame.dispose();
            new ConfiAluno(aluno);
        }
        if (e.getSource() == btmetas) {
            frame.dispose();
            new MetasAluno(aluno);
        }
        if (e.getSource() == btsair) {
            frame.dispose();
            new TelaLoginCadastro();
        }
    }
}
     

