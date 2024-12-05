package main.view;

import main.controller.AlunoController;
import main.model.Aluno;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class TelaCadAluno implements ActionListener {
    private JButton botaoConcluirCad;
    private JTextField nome;
    private JTextField idade;
    private JTextField email;
    private JTextField peso;
    private JComboBox<String> genero;
    private JPasswordField senha;
    JFrame frame = new JFrame("Cadastro do aluno");

    //Criando
    public TelaCadAluno() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 800);  
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        // Layout nulo para posicionamento manual
        frame.setLayout(null);

    //definindo botão
    botaoConcluirCad = new JButton("Concluir");
    botaoConcluirCad.setBounds(434, 612, 398, 48);  // Posição e tamanho do botão 
    // Adicionar o botão
     frame.add(botaoConcluirCad);


     // definindo os JtextField 
     nome = new JTextField();  // Texto placeholder
     nome.setBounds(360, 300, 400, 36);  // Posição e tamanho do campo
     nome.setForeground(Color.decode("#141831"));  // Cor do texto placeholder em HEX
     setupPlaceholder(nome, "Nome");
 
     idade = new JTextField("Informe sua idade");
     idade.setBounds(360, 350, 400, 36);
     idade.setForeground(Color.decode("#141831"));
     setupPlaceholder(idade, "Idade");
 
     email = new JTextField("Informe seu e-mail");
     email.setBounds(360, 400, 400, 36);
     email.setForeground(Color.decode("#141831"));
     setupPlaceholder(email, "Email");
 
     peso = new JTextField("Peso");
     peso.setBounds(360, 450, 400, 36);
     peso.setForeground(Color.decode("#141831"));
     setupPlaceholder(peso, "Peso");
 
     genero = new JComboBox<>(new String[]{"Selecione um gênero", "Masculino", "Feminino"}); // combox com placeholder
     genero.setBounds(360, 500, 400, 36);
     genero.setForeground(Color.decode("#141831"));

     // Adicionando um listener para detectar quando uma opção é selecionada
     genero.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (genero.getSelectedIndex() == 0) {
        } else {
        }
    }
});
     senha = new JPasswordField();
     senha.setBounds(360, 550, 400, 36);
     senha.setForeground(Color.decode("#141831"));
     senha.setEchoChar((char) 0);
     setupPasswordPlaceholder(senha, "Crie uma senha");

    // add ao frame
    frame.add(nome);
    frame.add(idade);
    frame.add(email);
    frame.add(peso);
    frame.add(genero);
    frame.add(senha);

    // Ajustando a imagem de fundo
    ImageIcon imagemFundo = new ImageIcon("src/main/view/img/CadastroAluno.png");  //caminho da imagem
    Image imagem = imagemFundo.getImage();
    Image imagemRedimensionada = imagem.getScaledInstance(frame.getWidth(), frame.getHeight(), Image.SCALE_SMOOTH);
    imagemFundo = new ImageIcon(imagemRedimensionada);

    // Definir a imagem de fundo no frame
    JLabel fundo = new JLabel(imagemFundo);
    fundo.setBounds(0, 0, frame.getWidth(), frame.getHeight());  // Faz a imagem ocupar toda a janela
    frame.add(fundo);

    botaoConcluirCad.addActionListener(this);

    // Remover foco inicial de qualquer campo
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

        

        if (e.getSource() == botaoConcluirCad) 
        {
            AlunoController alunoController = new AlunoController();
            String generoSelecionado = "";
            if(genero.getSelectedItem().toString().equals("Masculino"))
            {
                generoSelecionado = "M";
            }
            else
            {
                generoSelecionado = "F";
            }

            Aluno aluno =  alunoController.cadastrar(new Aluno(nome.getText(), email.getText(), senha.getText(), 2, Integer.parseInt(idade.getText()), (String) generoSelecionado, Double.parseDouble(peso.getText())));
            if (aluno != null) {
                JOptionPane.showMessageDialog(frame, "Aluno cadastrado com sucesso!");
                frame.dispose();
                    new TelaLoginCadastro();
            }
        }
    }
}
   