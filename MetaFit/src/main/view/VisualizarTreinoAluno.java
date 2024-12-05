package main.view;


import main.controller.AlunoTreinoController;
import main.controller.TreinoController;
import main.model.Aluno;
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

public class VisualizarTreinoAluno implements ActionListener {
    private JButton btnExcluir;
    private JTextArea instrucoes;
    private JTextArea objetivo;
    private JTextArea treino;
    private JTextField txtNome;
    private JComboBox<String> especialidadeTreinos;
    private Aluno aluno;
    private String idTreino;

    JFrame frame = new JFrame("Visualizar treino");

    public VisualizarTreinoAluno(Aluno aluno, String idTreino) {

        this.idTreino = idTreino;
        this.aluno = aluno;


        TreinoController treinoController = new TreinoController();
        Treino treinoBuscado = treinoController.buscar(idTreino);

        if (treinoBuscado == null) {
            JOptionPane.showMessageDialog(frame,"Treino não encontrado");
            frame.dispose();
            new HomeAluno(aluno);
        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 800);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        // Layout nulo para posicionamento manual
        frame.setLayout(null);

        //definindo botões
        btnExcluir = new JButton("Excluir");
        btnExcluir.setBounds(600, 710, 326, 46);
        frame.add(btnExcluir);


        //definindo os JtextArea
        assert treinoBuscado != null;
        objetivo = new JTextArea(treinoBuscado.getEspecialidadeTreino().toString().replace("[", "").replace("]", ""));
        objetivo.setBounds(50, 550, 500, 100);

        txtNome = new JTextField(treinoBuscado.getNomeTreino());
        txtNome.setBounds(50,130,300,30);


        instrucoes = new JTextArea(treinoBuscado.getDescricaoTreino());
        instrucoes.setBounds(50, 200, 300, 300);

        treino = new JTextArea(treinoBuscado.getInstucoes());
        treino.setBounds(700, 99, 500, 600);

        frame.add(objetivo);
        frame.add(instrucoes);
        frame.add(treino);
        frame.add(txtNome);

        // Criar o JComboBox para selecionar a especialidade

        especialidadeTreinos = new JComboBox<>(treinoBuscado.getEspecialidadeTreino().toArray(new String[0]));
        especialidadeTreinos.setBounds(460, 30, 500, 30);  // Ajustar a posição e o tamanho
        frame.add(especialidadeTreinos);

        btnExcluir.addActionListener(this);


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
      imageLabel.setBounds(50, 10, 150, 100); // Posição (x, y) e dimensões (largura, altura)

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

        frame.addWindowFocusListener(new java.awt.event.WindowAdapter()
        {
            public void windowGainedFocus(java.awt.event.WindowEvent e)
            {
                frame.getContentPane().requestFocusInWindow();
            }
        });

        // Exibir o frame
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
     if (e.getSource() == btnExcluir){
         AlunoTreinoController alunoTreinoController = new AlunoTreinoController();
         alunoTreinoController.removerAlunoDoTreino(aluno.getId(), idTreino);
         JOptionPane.showMessageDialog(frame,"Treino excluido com sucesso");
         frame.dispose();
         new HomeAluno(aluno);
     }
    }
}


