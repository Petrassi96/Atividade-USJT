package main.view;

import main.controller.AlunoController;
import main.controller.ProfessorController;
import main.controller.utils.CriptografarSenha;
import main.model.Aluno;
import main.model.Professor;

import javax.swing.*;

import java.awt.event.MouseEvent;
import java.io.File;
import java.awt.event.MouseAdapter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class ConfiProf implements ActionListener{
    private JButton botaoAlterarp;
    private JButton excluirContap;
    private JTextField nomep;
    private JTextField especialidade;
    private JTextField emailp;
    private JTextField senhap;
    private Professor professor;
    JFrame frame = new JFrame("Configurações");

    public ConfiProf(Professor professor) {
        this.professor = professor;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 800);  
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        // Layout nulo para posicionamento manual
        frame.setLayout(null);

        // definindo os JtextField 
    nomep = new JTextField(professor.getNome());
    nomep.setBounds(360, 300, 400, 36);  
    nomep.setForeground(Color.decode("#141831"));

    especialidade = new JTextField(String.valueOf(professor.getEspecialidades()).replace("[", " ").replace("]", ""));
    especialidade.setBounds(360, 350, 400, 36);
    especialidade.setForeground(Color.decode("#141831"));

    emailp = new JTextField(professor.getEmail());
    emailp.setBounds(360, 400, 400, 36);
    emailp.setForeground(Color.decode("#141831"));

    senhap = new JTextField("senha");
    senhap.setBounds(360, 450, 400, 36);
    senhap.setForeground(Color.decode("#141831"));

    //add ao frame
    frame.add(nomep);
    frame.add(especialidade);
    frame.add(emailp);
    frame.add(senhap);

    //definindo botões
    botaoAlterarp = new JButton("Alterar");
    botaoAlterarp.setBounds(434, 612, 398, 48);

    excluirContap = new JButton("Excluir conta");
    excluirContap.setBounds(434, 670, 398, 48);

    //add botões
    frame.add(botaoAlterarp);
    frame.add(excluirContap);


     // Ajustando a imagem de fundo
     ImageIcon imagemFundo = new ImageIcon("src/main/view/img/ConfiPF.png");  //caminho da imagem
     Image imagem = imagemFundo.getImage();
     Image imagemRedimensionada = imagem.getScaledInstance(frame.getWidth(), frame.getHeight(), Image.SCALE_SMOOTH);
     imagemFundo = new ImageIcon(imagemRedimensionada);
 
     // Definir a imagem de fundo no frame
     JLabel fundo = new JLabel(imagemFundo);
     fundo.setBounds(0, 0, frame.getWidth(), frame.getHeight());  // Faz a imagem ocupar toda a janela

     //Definir voltar
     ImageIcon voltarIcon = new ImageIcon("src/main/view/img/VOLTAR.png");
     Image voltar = voltarIcon.getImage().getScaledInstance(150, 40, Image.SCALE_SMOOTH);

      // Criar um JLabel com a imagem
      JLabel imageLabel = new JLabel(new ImageIcon(voltar));
      imageLabel.setBounds(30, 5, 200, 100); // Posição (x, y) e dimensões (largura, altura)

      imageLabel.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e) 
            {
                frame.dispose();
                new HomeProf(professor);
            }
        });

    botaoAlterarp.addActionListener(this);
    excluirContap.addActionListener(this);

 
    frame.add(imageLabel);
    frame.add(fundo);
     
      // Exibir o frame
    frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == excluirContap){
            ProfessorController professorController= new ProfessorController();
            professorController.excluir(professor.getId());
            frame.dispose();
            new TelaLoginCadastro();
        }
        if (e.getSource() == botaoAlterarp){
            if (!senhap.getText().equals("senha")) {
                if (especialidade.getText().contains(",")) {
                    ProfessorController professorController = new ProfessorController();
                    String textoEspecialidades = especialidade.getText();

                    ArrayList<String> especialidadesList = new ArrayList<>(Arrays.stream(textoEspecialidades.split(","))
                            .map(String::trim)
                            .filter(s -> !s.isEmpty())
                            .toList());

                    this.professor = professorController.atualizar(new Professor(professor.getId(), nomep.getText(), emailp.getText(), CriptografarSenha.criptografarSenha(senhap.getText()), 1, especialidadesList ));
                    JOptionPane.showMessageDialog(null, "dados atalizados com sucesso!");
                    frame.dispose();
                    new HomeProf(professor);
                }else {
                    JOptionPane.showMessageDialog(null,"é necessario separar as especialidades por ,");
                }


            }else {
                JOptionPane.showMessageDialog(frame, "Digite sua senha");
            }
        }


    }
}
