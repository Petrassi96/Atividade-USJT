package main.view;

import javax.swing.*;

import main.dao.AlunoDao;
import main.model.Aluno;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.File;
import java.awt.event.MouseAdapter;

public class AdicionarMeta implements ActionListener
{
  private JButton registrar;
  private JTextField pesoAtual;
  private JTextField pesoMeta;
  private JFrame frame;
  private static Aluno aluno;
      
      public AdicionarMeta(Aluno aluno)
      {
      frame = new JFrame("Adicionar Meta");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(1280, 800);  
      frame.setLocationRelativeTo(null);
      frame.setResizable(false);
      // Layout nulo para posicionamento manual
      frame.setLayout(null);
      
      //definindo JTextField
      pesoAtual = new JTextField();
      pesoAtual.setBounds(454, 251, 398, 48); 
      
      pesoMeta = new JTextField();  
      pesoMeta.setBounds(434, 330, 398, 48); 
  
      frame.add(pesoAtual);
      frame.add(pesoMeta);
  
      //definindo botões
  
      registrar = new JButton("Registrar");
      registrar.setBounds(500, 608, 392, 61);
      
      frame.add(registrar);
  
       // Ajustando a imagem de fundo
      ImageIcon imagemFundo = new ImageIcon("src/main/view/img/Metas.png");  //caminho da imagem
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
              new HomeAluno(aluno);
            }
        });
  
      //Definindo os botões
      registrar.addActionListener(this);
   
      frame.add(imageLabel);
      frame.add(fundo);
      // Exibir o frame
      frame.setVisible(true);
    }


    public void actionPerformed(ActionEvent e) 
    {
      if(e.getSource() == registrar)
      {
        JOptionPane.showMessageDialog(null, "Registrado");
        //Adicionar função necessária
      }
      
    }
}
    

