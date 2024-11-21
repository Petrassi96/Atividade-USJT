import java.util.ArrayList;

public class BancoDeClientes 
{
    private ArrayList<Cliente> clientes;

    public BancoDeClientes()
    {
        clientes = new ArrayList<Cliente>();
    }

    public void addCliente(Cliente cliente)
    {
        clientes.add(cliente);
    }
    public boolean removeCliente(String nome)
    {
        int posicao = buscar(nome);
        if(posicao >= 0)
        {
            clientes.remove(posicao);
            return true;
        }
        else
        return false;
    }

    public boolean alterarCliente(String nome, String fone, int id)
    {
        int posicao = buscar(nome);

        if(posicao >= 0 && posicao < clientes.size())
        {
            Cliente cliente = clientes.get(posicao);
            cliente.setNome(nome);
            cliente.setFone(fone);
            cliente.setId(id);

            return true;
        }
        else
        {
            return false;
        }
    }

    public String mostrarCliente(String nome)
    {
        int posicao = buscar(nome);
        if(posicao >= 0 && posicao < clientes.size())
        {
            Cliente cliente = clientes.get(posicao);
            
            return "Nome: " + cliente.getNome() + "\n" +
                   "Telefone: " + cliente.getFone() + "\n" +
                   "ID: " + cliente.getId();
        }
        else
        {
            return "Cliente não encontrado.";
        }
    }
    public ArrayList<Cliente> clientes()
    {
        return clientes;
    }

    public String listarClientes()
    {
        if(clientes.isEmpty())
        {
            return "Não há clientes";
        }
        else
        {
            StringBuilder listarClientes = new StringBuilder();
            for(int i = 0; i < clientes.size(); i++)
            {
                listarClientes.append(i).append(": ").append(clientes.get(i).getDados()).append("\n");
            }
            return listarClientes.toString();
        }   
    }

    private int buscar(String nome)
    {
        for(int i = 0; i < clientes.size(); i++)
        {
            Cliente cliente = clientes.get(i);
            String nomeCliente = cliente.getNome();

            if(nome.equals(nomeCliente))
            {
                return i;
            }
        }
            return -1;
    }

    public void addCliente(String nome, String fone, int id)
    {
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setFone(fone);
        cliente.setId(id);
        clientes.add(cliente);
    }
}

