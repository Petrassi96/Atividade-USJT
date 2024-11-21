import javax.swing.JOptionPane;

public class AppBloco 
{
    public static void main (String []args)
    {
        BlocoDeNotas blocoDeNotas = new BlocoDeNotas();

        while (true) 
        {
            int menu = Integer.parseInt(JOptionPane.showInputDialog(
            "Digite uma das opções" + "\n1: Insira uma nota" + "\n2: Remova uma nota"
            + "\n3: Altere uma nota" + "\n4: Listar notas" + "\n5: Sair"));
            
            if(menu == 1)
            {
                String nota = JOptionPane.showInputDialog("Digite uma nota");
                blocoDeNotas.addNota(nota);
            }
            else if(menu == 2)
            {
                if(blocoDeNotas.getNotas().isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Não há notas.");
                }
                else
                {
                    blocoDeNotas.listarNotas();
                    int indice = Integer.parseInt(JOptionPane.showInputDialog("Escolha a nota que quer remover"));
                    blocoDeNotas.removeNota(indice);
                }
            }
            else if(menu == 3)
            {
                if(blocoDeNotas.getNotas().isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Não há notas.");
                }
                else
                {
                    blocoDeNotas.listarNotas();
                    int indice = Integer.parseInt(JOptionPane.showInputDialog("Escolha a nota que quer remover"));
                    String novaNota = JOptionPane.showInputDialog("Altere a nota");
                    blocoDeNotas.alterarNota(indice, novaNota);
                }
            }
            else if(menu == 4)
            {
                if(blocoDeNotas.getNotas().isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Não há notas.");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, blocoDeNotas.listarNotas());
                }
            }
            else if(menu == 5)
            {
                System.exit(0);
            }
        
        }
    }
}