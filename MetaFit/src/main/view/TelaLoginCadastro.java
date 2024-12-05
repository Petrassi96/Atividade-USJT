package main.view;

import main.controller.AlunoController;
import main.controller.ProfessorController;
import main.controller.utils.CriptografarSenha;
import main.dao.UsuarioDao;
import main.model.Aluno;
import main.model.Professor;
import main.model.Usuario;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TelaLoginCadastro implements ActionListener{
    private JButton botaoLogin, botaoCadastro;
    private JTextField campoEmail;
    private JPasswordField campoSenha;
    JFrame frame = new JFrame("Tela de Login e Cadastro");

    public TelaLoginCadastro() {
        // Criando

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 800);  // Tamanho da janela
        frame.setLocationRelativeTo(null);  // centraliza a janela na telCea
        frame.setResizable(false);  // Desabilita maximizar
        // Layout nulo para posicionamento manual
        frame.setLayout(null);

        // Definir os campos de texto para e-mail e senha
        campoEmail = new JTextField();
        campoEmail.setBounds(400, 359, 480, 36);  // Posição e tamanho do campo de e-mail
        setupPlaceholder(campoEmail, "Digite seu email");


        campoSenha = new JPasswordField();
        campoSenha.setBounds(400, 439, 480, 36);  // Posição e tamanho do campo de senha
        campoSenha.setEchoChar((char) 0);
        setupPasswordPlaceholder(campoSenha, "Digite sua senha");



        // Adicionar os campos de texto ao frame
        frame.add(campoEmail);
        frame.add(campoSenha);

        // Definir os botões de Login e Cadastro
        botaoLogin = new JButton("Entrar");
        botaoLogin.setBounds(490, 500, 300, 46);  // Posição e tamanho do botão "Entrar na Home"

        botaoCadastro = new JButton("Cadastro");
        botaoCadastro.setBounds(490, 570, 300, 46);  // Posição e tamanho do botão "Cadastro"

        // Adicionar os botões ao frame
        frame.add(botaoLogin);
        frame.add(botaoCadastro);
        botaoLogin.addActionListener(this);
        botaoCadastro.addActionListener(this);

        // Ajustando a imagem de fundo
        ImageIcon imagemFundo = new ImageIcon("src/main/view/img/telaLoginCadastro.png");  //caminho da imagem
        Image imagem = imagemFundo.getImage();
        Image imagemRedimensionada = imagem.getScaledInstance(frame.getWidth(), frame.getHeight(), Image.SCALE_SMOOTH);
        imagemFundo = new ImageIcon(imagemRedimensionada);

        // Definir a imagem de fundo no frame
        JLabel fundo = new JLabel(imagemFundo);
        fundo.setBounds(0, 0, frame.getWidth(), frame.getHeight());  // Faz a imagem ocupar toda a janela
        frame.add(fundo);

        frame.addWindowFocusListener(new java.awt.event.WindowAdapter() 
        {
            public void windowGainedFocus(java.awt.event.WindowEvent e) 
            {
                frame.getContentPane().requestFocusInWindow(); // Tira o foco dos campos de texto
            }
        });

        // Exibir o frame
        frame.setVisible(true);
    }

    private static void setupPlaceholder(JTextField textField, String placeholder) {
        textField.setText(placeholder);
        textField.setForeground(Color.GRAY);
    
        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (textField.getText().equals(placeholder)) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                }
            }
    
            @Override
            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setText(placeholder);
                    textField.setForeground(Color.GRAY);
                }
            }
        });
    
    }
    
        private static void setupPasswordPlaceholder(JPasswordField passwordField, String placeholder) 
        {
            passwordField.setText(placeholder);
            passwordField.setForeground(Color.GRAY);
        
            passwordField.addFocusListener(new FocusListener()
            {
                public void focusGained(FocusEvent e) {
                    if (String.valueOf(passwordField.getPassword()).equals(placeholder)) 
                    {
                        passwordField.setText("");
                        passwordField.setForeground(Color.BLACK);
                        passwordField.setEchoChar('*'); // Ativar a máscara ao digitar
                    }
                }
        
                @Override
                public void focusLost(FocusEvent e) {
                    if (String.valueOf(passwordField.getPassword()).isEmpty()) 
                    {
                        passwordField.setText(placeholder);
                        passwordField.setForeground(Color.GRAY);
                        passwordField.setEchoChar((char) 0);
                    }
                }
            });
    }



    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == botaoCadastro){
            frame.dispose();
            new TelaEscolha();
        }
        if(e.getSource() == botaoLogin){
            String email = campoEmail.getText();
            String senha = new String (campoSenha.getPassword());
            AlunoController alunoController = new AlunoController();
            Object usuario = alunoController.fazerLogin(email,senha);

            if (usuario != null){
                if (usuario instanceof Aluno){
                    frame.dispose();
                    new HomeAluno((Aluno) usuario);
                } else if (usuario instanceof Professor) {
                    frame.dispose();
                     new HomeProf((Professor) usuario);

                }
            }else {
                JOptionPane.showMessageDialog(frame,"Usuario não encontrado");
            }

            }
        }

}