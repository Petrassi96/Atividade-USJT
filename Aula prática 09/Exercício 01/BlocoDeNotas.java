import java.util.ArrayList;

public class BlocoDeNotas
{
    private ArrayList<String> notas;

    public BlocoDeNotas()
    {
        notas = new ArrayList<String>();
    }

    public void addNota(String nota)
    {
        notas.add(nota);
    }

    public void removeNota(int indice)
    {
        if(indice >= 0 && indice < notas.size())
        {
            notas.remove(indice);
        }
    }

    public void alterarNota(int indice, String novaNota)
    {
        if(indice >= 0 && indice < notas.size())
        {
            notas.set(indice, novaNota);
        }
    }
    public int buscarNota(String nota)
    {
        return buscar(nota);
    }

    public ArrayList<String> getNotas()
    {
        return notas;
    }

    private int buscar(String nota)
    {
        return notas.indexOf(nota);
    }

    public String listarNotas()
    {
        if(notas.isEmpty())
        {
            return "Não há notas";
        }
        else
        {
            StringBuilder listarNotas = new StringBuilder();
            for (int i = 0; i < notas.size(); i++) 
            {
                listarNotas.append(i).append(": ").append(notas.get(i)).append("\n");
            }

            return listarNotas.toString();
        }
    }
}