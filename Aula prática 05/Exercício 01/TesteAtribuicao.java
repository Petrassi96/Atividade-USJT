import javax.swing.JOptionPane;
public class TesteAtribuicao
{
    public static void main (String [] args)
    {
        String nome = JOptionPane.showInputDialog ("Digite o nome do professor");
        int idade = Integer.parseInt (JOptionPane.showInputDialog ("Idade do professor"));
        String materia = JOptionPane.showInputDialog ("Disciplina");
        String resposta = JOptionPane.showInputDialog ("Essa disciplina é prática? (Sim ou Não?)");
        boolean pratica = resposta.equalsIgnoreCase("sim");

        //Criando os objetos
        Professor professor = new Professor(nome, idade);
        Disciplina disciplina = new Disciplina(materia, pratica);
        Atribuicao atribuicao = new Atribuicao (professor, disciplina);

        //Mostrando o resultado
        JOptionPane.showMessageDialog (null, atribuicao.getDados());
    }
}