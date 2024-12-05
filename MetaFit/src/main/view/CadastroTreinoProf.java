package main.view;

import main.model.Professor;

import javax.swing.*;

import java.awt.event.MouseEvent;
import java.io.File;
import java.awt.event.MouseAdapter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroTreinoProf implements ActionListener
{
    private JButton avancar;
    private JTextField nomeTreino;
    JFrame frame = new JFrame("Cadastro inicial do Treino");
    private Professor professor;

    
    public CadastroTreinoProf(Professor professor)
    {
        this.professor = professor;

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1280, 800);  
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);
     // Layout nulo para posicionamento manual
    frame.setLayout(null);

    //definindo botões
    avancar = new JButton("AVANÇAR");
    avancar.setBounds(500, 550, 326, 46);
    frame.add(avancar);

    //definindo JTextField
    nomeTreino = new JTextField(" ");  
    nomeTreino.setBounds(360, 240, 400, 36);

    frame.add(nomeTreino);

    // Ajustando a imagem de fundo
    ImageIcon imagemFundo = new ImageIcon("src/main/view/img/CadastroTreinoProfessor.png");  //caminho da imagem
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
                new HomeProf(professor);
            }
        });

    avancar.addActionListener(this);

    frame.add(imageLabel);
    frame.add(fundo);
    
    // Exibir o frame
    frame.setVisible(true);
}


    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == avancar) {
           frame.dispose();
           new RegistroTreinoProf(professor,nomeTreino.getText());
       }
}


}
