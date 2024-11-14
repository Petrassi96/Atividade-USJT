import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame implements ActionListener
{
    private JTextField txtTeclado;
    private JButton btnZero, btnUm, btnDois, btnTres, btnQuatro, btnCinco, btnSeis, 
    btnSete, btnOito, btnNove, btnAdicao, btnSubtracao, btnMultiplicacao, btnDivisao,
    btnLimpar, btnResultado;

    private int numero;
    private String operacao;
    private int resultado;

    public Calculadora()
    {
        super("Calculadora");

        txtTeclado = new JTextField(20);
        txtTeclado.setEditable(false);

        //Montando painel de botões
        JPanel painelBotoes = new JPanel(new GridLayout(5,4,5,5));
        btnZero = new JButton("0");
        btnUm = new JButton("1");
        btnDois = new JButton("2");
        btnTres = new JButton("3");
        btnQuatro = new JButton("4");
        btnCinco = new JButton("5");
        btnSeis = new JButton("6");
        btnSete = new JButton("7");
        btnOito = new JButton("8");
        btnNove = new JButton("9");
        btnAdicao = new JButton("+");
        btnSubtracao = new JButton("-");
        btnMultiplicacao = new JButton("*");
        btnDivisao = new JButton("/");
        btnLimpar = new JButton("C");
        btnResultado = new JButton("=");

        //Adicionando os botões no painel
        painelBotoes.add(btnSete);
        painelBotoes.add(btnOito);
        painelBotoes.add(btnNove);
        painelBotoes.add(btnDivisao);

        painelBotoes.add(btnQuatro);
        painelBotoes.add(btnCinco);
        painelBotoes.add(btnSeis);
        painelBotoes.add(btnMultiplicacao);

        painelBotoes.add(btnUm);
        painelBotoes.add(btnDois);
        painelBotoes.add(btnTres);
        painelBotoes.add(btnSubtracao);

        painelBotoes.add(btnZero);
        painelBotoes.add(btnLimpar);
        painelBotoes.add(btnResultado);
        painelBotoes.add(btnAdicao);


        //Atribuir listeners aos botões
        btnZero.addActionListener(this);
        btnUm.addActionListener(this);
        btnDois.addActionListener(this);
        btnTres.addActionListener(this);
        btnQuatro.addActionListener(this);
        btnCinco.addActionListener(this);
        btnSeis.addActionListener(this);
        btnSete.addActionListener(this);
        btnOito.addActionListener(this);
        btnNove.addActionListener(this);
        btnAdicao.addActionListener(this);
        btnSubtracao.addActionListener(this);
        btnMultiplicacao.addActionListener(this);
        btnDivisao.addActionListener(this);
        btnLimpar.addActionListener(this);
        btnResultado.addActionListener(this);

        //Montando a tela
        Container caixa = getContentPane();
        caixa.setLayout(new BorderLayout(30,45));
        caixa.add(txtTeclado, BorderLayout.NORTH);
        caixa.add(painelBotoes, BorderLayout.CENTER);

        setSize(350,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String comando = e.getActionCommand();

       if (comando.equals("C")) 
       {
            txtTeclado.setText("");
            numero = 0;
            operacao = null;
            resultado = 0;
        } else if (comando.equals("=")) {
            // Realizar o cálculo
            try {
                int valor = Integer.parseInt(txtTeclado.getText());  // Converte o texto para inteiro
                switch (operacao) {
                    case "+":
                        resultado = numero + valor;
                        break;
                    case "-":
                        resultado = numero - valor;
                        break;
                    case "*":
                        resultado = numero * valor;
                        break;
                    case "/":
                        if (valor != 0) {
                            resultado = numero / valor;
                        } else {
                            JOptionPane.showMessageDialog(this, "Não é possível dividir por zero!");
                            resultado = 0;
                        }
                        break;
                    default:
                        break;
                }
                txtTeclado.setText(String.valueOf(resultado));
                operacao = null; // Limpar a operação após o cálculo
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Entrada inválida.");
            }
        } else if (comando.equals("+") || comando.equals("-") || comando.equals("*") || comando.equals("/")) {
            // Salvar o número atual e a operação
            try {
                numero = Integer.parseInt(txtTeclado.getText());
                operacao = comando;
                txtTeclado.setText("");  // Limpar o display para o próximo número
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Entrada inválida.");
            }
        } else {

            txtTeclado.setText(txtTeclado.getText() + comando);
        }
    }

}