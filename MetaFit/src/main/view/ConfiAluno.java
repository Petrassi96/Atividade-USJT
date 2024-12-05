package main.view;

import main.controller.AlunoController;
import main.controller.AlunoTreinoController;
import main.controller.utils.CriptografarSenha;
import main.model.Aluno;

import javax.swing.*;

import java.awt.event.MouseEvent;
import java.io.File;
import java.awt.event.MouseAdapter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfiAluno implements ActionListener {
    private JButton botaoAlterar;
    private JButton excluirConta;
    private JTextField nome;
    private JTextField idade;
    private JTextField email;
    private JTextField peso;
    private JTextField genero;
    private JTextField senha;
    private Aluno aluno;
    JFrame frame = new JFrame("Configurações");

    public ConfiAluno(Aluno aluno) {
        this.aluno = aluno;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 800);  
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        // Layout nulo para posicionamento manual
        frame.setLayout(null);

           // definindo os JtextField 
    nome = new JTextField(aluno.getNome());
    nome.setBounds(360, 300, 400, 36);  
    nome.setForeground(Color.decode("#141831"));

    idade = new JTextField(""+aluno.getIdade());
    idade.setBounds(360, 350, 400, 36);
    idade.setForeground(Color.decode("#141831"));

    email = new JTextField(aluno.getEmail());
    email.setBounds(360, 400, 400, 36);
    email.setForeground(Color.decode("#141831"));

    peso = new JTextField(""+aluno.getPeso());
    peso.setBounds(360, 450, 400, 36);
    peso.setForeground(Color.decode("#141831"));

    genero = new JTextField(aluno.getGenero());
    genero.setBounds(360, 500, 400, 36);
    genero.setForeground(Color.decode("#141831"));

    senha = new JTextField("senha");
    senha.setBounds(360, 550, 400, 36);
    senha.setForeground(Color.decode("#141831"));





    // add ao frame
    frame.add(nome);
    frame.add(idade);
    frame.add(email);
    frame.add(peso);
    frame.add(genero);
    frame.add(senha);


    //definindo botões
    botaoAlterar = new JButton("Alterar");
    botaoAlterar.setBounds(434, 612, 398, 48);

    excluirConta = new JButton("Excluir conta");
    excluirConta.setBounds(434, 670, 398, 48);

    //add botões
    frame.add(botaoAlterar);
    frame.add(excluirConta);

    botaoAlterar.addActionListener(this);
    excluirConta.addActionListener(this);


     // Ajustando a imagem de fundo
     ImageIcon imagemFundo = new ImageIcon("src/main/view/img/ConfAl.png");  //caminho da imagem
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

        if (e.getSource() == botaoAlterar) {


            if (!senha.getText().equals("senha")) {
                AlunoController alunoController = new AlunoController();

                this.aluno = alunoController.atualizar(new Aluno(aluno.getId(), nome.getText(), email.getText(), CriptografarSenha.criptografarSenha(senha.getText()), 2, Integer.parseInt(idade.getText()), genero.getText(), Double.parseDouble(peso.getText())));
                JOptionPane.showMessageDialog(null, "dados atalizados com sucesso!");
                frame.dispose();
                new HomeAluno(aluno);
            }else {
                JOptionPane.showMessageDialog(frame, "Digite sua senha");
            }
        }

        if (e.getSource() == excluirConta){
            AlunoController alunoController= new AlunoController();
            alunoController.excluir(aluno.getId());
            frame.dispose();
            new TelaLoginCadastro();
        }
    }
}
