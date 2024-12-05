package main.view;

import main.controller.TreinoController;
import main.model.Professor;
import main.model.Treino;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class HomeProf implements ActionListener {
    private JButton btconfiguracaop;
    private JButton btsairp, btnExcluir;
    private JButton addTreinos;
    private Professor professor;
    private Treino treino;
    JFrame frame = new JFrame("Home Professor");

    public HomeProf(Professor usuario) {
        this.professor = usuario;

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280, 800);  
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        // Layout nulo para posicionamento manual
        frame.setLayout(null);
        
        //definindo botões
        btconfiguracaop = new JButton("Configurações");
        btconfiguracaop.setBounds(20, 400, 326, 46);

        btsairp = new JButton("Sair");
        btsairp.setBounds(20, 450, 326, 46);

        addTreinos = new JButton("Adicionar +");
        addTreinos.setBounds(800, 400, 326, 46);

        btconfiguracaop.addActionListener(this);
        btsairp.addActionListener(this);
        addTreinos.addActionListener(this);

        //add botões
        frame.add(btconfiguracaop);
        frame.add(btsairp);
        frame.add(addTreinos);

        TreinoController treinoController = new TreinoController();

        ArrayList<Treino> treinos = (ArrayList<Treino>) treinoController.listarPorProfessor(professor.getId());

        int yPosition = 350; // Posição inicial dos botões
        for (Treino treino : treinos) {
            JButton button = new JButton(treino.getNomeTreino());
            button.setBounds(500, yPosition, 199, 46);
            frame.add(button);

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                  new AtualizarExcluirTreino(professor, treino.getId());
                }
            });

            yPosition += 50; // Incrementa a posição para o próximo botão
        }


        // Ajustando a imagem de fundo
      ImageIcon imagemFundo = new ImageIcon("src/main/view/img/HomeProf.png");  //caminho da imagem
      Image imagem = imagemFundo.getImage();
      Image imagemRedimensionada = imagem.getScaledInstance(frame.getWidth(), frame.getHeight(), Image.SCALE_SMOOTH);
      imagemFundo = new ImageIcon(imagemRedimensionada);

     // Definir a imagem de fundo no frame
     JLabel fundo = new JLabel(imagemFundo);
     fundo.setBounds(0, 0, frame.getWidth(), frame.getHeight());  // Faz a imagem ocupar toda a janela
     frame.add(fundo);



     // Exibir o frame
    frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btconfiguracaop) {
            frame.dispose();
            new ConfiProf(professor);
        }
        if (e.getSource() == btsairp) {
            frame.dispose();
            new TelaLoginCadastro();
        }
        if (e.getSource() == addTreinos) {
            frame.dispose();
            new CadastroTreinoProf(professor);
        }
        if(e.getSource() == btnExcluir)
        {
            TreinoController treinoController = new TreinoController();
            treinoController.excluir(treino.getId());
            frame.dispose();
        }
    }
}
 



    
    

