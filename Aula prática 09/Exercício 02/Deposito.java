import java.util.ArrayList;

public class Deposito 
{
    private ArrayList<Caixa> caixas;

    public Deposito()
    {
        caixas = new ArrayList<Caixa>();
    }

    public void addCaixa(Caixa caixa)
    {
        caixas.add(caixa);
    }

    public boolean removeCaixa(String dono)
    {
        int posicao = buscar(dono);
        if(posicao >= 0)
        {
            caixas.remove(posicao);
            return true;
        }
        else
        {
            return false;
        }
    }

    public int encontraCaixa(String dono)
    {
        return buscar(dono);
    }

    public boolean alterarCaixa(String corredor, String dono, int novaPosicao)
    {
        int posicao = buscar(dono);
        if(posicao >= 0)
        {
            Caixa caixa = caixas.get(posicao);
            caixa.setPosicao(novaPosicao);
            caixa.setCorredor(corredor);

            return true;
        }
        else
        {
            return false;
        }
    }

    public ArrayList<Caixa> listarCaixas(double pesoLimite)
    {
        if(caixas.size() == 0)
        {
            return new ArrayList<>();
        }

        ArrayList<Caixa> maisPesadas = new ArrayList<>();

        for(int i = 0; i < caixas.size(); i++)
        {
            Caixa caixa = caixas.get(i);
            if(caixa.getPeso() > pesoLimite)
            {
                maisPesadas.add(caixa);
            }
        }
            return maisPesadas;
    }

    //Método buscar
    private int buscar(String dono)
    {
        for(int i = 0; i < caixas.size(); i++)
        {
            Caixa caixa = caixas.get(i);
            String nomeDono = caixa.getDono();

            if(dono.equals(nomeDono))
            {
                return i;
            }
        }
            return -1;
    }

    public void addCaixa(String dono, String corredor, double peso)
    {
        Caixa caixa = new Caixa();
        caixa.setDono(dono);
        caixa.setCorredor(corredor);
        caixa.setPeso(peso);
        caixas.add(caixa);
    }
}

