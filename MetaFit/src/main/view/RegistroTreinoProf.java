package main.view;

import main.controller.TreinoController;
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
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class RegistroTreinoProf implements ActionListener {
    private JButton registrarT;
    private JTextArea instrucoes;
    private JTextArea objetivo;
    private JTextArea treino;
    private JComboBox<String> especialidadeTreinos; 
    private Professor professor;
    private String nomeTreino;
    JFrame frame = new JFrame("Registro Treino");
    public RegistroTreinoProf(Professor professor, String nomeTreino) {
        this.nomeTreino = nomeTreino;
    this.professor = professor;
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1280, 800);  
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);
     // Layout nulo para posicionamento manual
    frame.setLayout(null);

    //definindo botões
    registrarT = new JButton("Registrar");
    registrarT.setBounds(500, 710, 326, 46);
    frame.add(registrarT);

    //definindo os JtextArea
    objetivo = new JTextArea();  
    objetivo.setBounds(50, 99, 500, 100);
    setupPlaceholder(objetivo, "Digite o objetivo");


    instrucoes = new JTextArea();  
    instrucoes.setBounds(50, 250, 300, 300);
    setupPlaceholder(instrucoes, "Digite as Instruções");

    treino = new JTextArea();  
    treino.setBounds(700, 99, 500, 600);
    setupPlaceholder(treino, "Digite o Treino");

    frame.add(objetivo);
    frame.add(instrucoes);
    frame.add(treino);

     // Criar o JComboBox para selecionar a especialidade
     String[] especialidades = {
        "Treino para Hipertrofia Muscular",
        "Treino para Perda de Peso",
        "FullBody"
    };
    especialidadeTreinos = new JComboBox<>(especialidades);
    especialidadeTreinos.setBounds(460, 30, 500, 30);  // Ajustar a posição e o tamanho
    frame.add(especialidadeTreinos);

    registrarT.addActionListener(this);


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
      imageLabel.setBounds(90, 130, 50, 40); // Posição (x, y) e dimensões (largura, altura)

      imageLabel.addMouseListener(new MouseAdapter() 
        {
            public void mouseClicked(MouseEvent e) 
            {
                frame.dispose();
                new HomeProf(professor);
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

    private static void setupPlaceholder(JTextArea textArea, String placeholder) {
        textArea.setText(placeholder);
        textArea.setForeground(Color.GRAY);
    
        textArea.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (textArea.getText().equals(placeholder)) {
                    textArea.setText("");
                    textArea.setForeground(Color.BLACK);
                }
            }
    
            @Override
            public void focusLost(FocusEvent e) {
                if (textArea.getText().isEmpty()) {
                    textArea.setText(placeholder);
                    textArea.setForeground(Color.GRAY);
                }
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     if (e.getSource() == registrarT) {

         TreinoController treinoController = new TreinoController();
         treinoController.cadastrar(new Treino(nomeTreino,objetivo.getText(), Collections.singletonList(Objects.requireNonNull(especialidadeTreinos.getSelectedItem()).toString()),professor.getId(), instrucoes.getText()));
         JOptionPane.showMessageDialog(frame,"Treino cadastrado com sucesso");
         frame.dispose();
         new HomeProf(professor);

     }
    }
}
