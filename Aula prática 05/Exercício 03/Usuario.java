import javax.swing.JOptionPane;

public class Usuario
{
    public static void main (String [] args)
    {
        CondicionadorDeAr condicionadorDeAr = new CondicionadorDeAr();
        condicionadorDeAr.ligar();

        while (true)
        {
            int controle = Integer.parseInt(JOptionPane.showInputDialog
            ("Aumentar temperatura - 1 \nDIminuir tempreatura - 2 \nOu - 0 para sair."));

            if(controle == 0)
            {
                break;
            }

            try
            {
                if(controle == 1)
                {
                    condicionadorDeAr.aumentarTemperatura();
                }

                else if(controle == 2)
                {
                    condicionadorDeAr.diminuirTemperatura();
                }

                if (controle < 1 || controle > 2)
                {
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    continue;
                }
            }

                catch (IllegalArgumentException e)
                {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
        }

        JOptionPane.showMessageDialog(null, condicionadorDeAr.imprimirTemperatura());
        JOptionPane.showMessageDialog(null, "Programa encerrado.");
    }
}
