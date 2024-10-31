import javax.swing.JOptionPane;
public class Teste 
{
    public static void main (String [] args)
    {
        double salario = 1500.00;
        double seguroDesemprego = 1200.00;
        
        String nome = JOptionPane.showInputDialog("Digite seu nome.");
        String sobrenome = JOptionPane.showInputDialog("Digite seu sobrenome.");
        String cpf = JOptionPane.showInputDialog("Digite seu cpf.");

        Empregado empregado = new Empregado(nome, sobrenome, cpf);
        JOptionPane.showMessageDialog(null, "Empregado\n" + empregado.dados());

        Mensalista mensalista = new Mensalista(nome, sobrenome, cpf, salario);
        JOptionPane.showMessageDialog(null, "Mensalista\n" + mensalista.dados());

        double comissao = Double.parseDouble(JOptionPane.showInputDialog("Valor da comissão."));
        Comissionado comissionado = new Comissionado(nome, sobrenome, cpf, salario, comissao);
        JOptionPane.showMessageDialog(null, "Comissionado\n" + comissionado.dados());

        int horasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Digite as horas trabalhadas"));
        double valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora"));
        Horista horista = new Horista(nome, sobrenome, cpf);

        horista.setHorasTrabalhadas(horasTrabalhadas);
        horista.setValorHora(valorHora);

        JOptionPane.showMessageDialog(null, "Horista\n" + horista.dados());
        
        int tarefasRealizadas = Integer.parseInt(JOptionPane.showInputDialog("Tarefas realizadas"));
        double valorTarefa = Double.parseDouble(JOptionPane.showInputDialog("Valor por tarefa"));
        Tarefeiro tarefeiro = new Tarefeiro(nome, sobrenome, cpf, tarefasRealizadas, valorTarefa);

        tarefeiro.setTarefasRealizadas(tarefasRealizadas);
        tarefeiro.setValorTarefa(tarefasRealizadas);

        JOptionPane.showMessageDialog(null, "Tarefeiro\n " + tarefeiro.dados());

        Desempregado desempregado = new Desempregado(nome, sobrenome, cpf, seguroDesemprego);
        JOptionPane.showMessageDialog(null, "Desempregado\n" + desempregado.dados());
    }
}