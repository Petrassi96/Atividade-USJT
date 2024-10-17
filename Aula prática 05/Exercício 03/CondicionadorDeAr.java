public class CondicionadorDeAr
{
    private Termostato termostato;
    private boolean ligado;

    public CondicionadorDeAr ()
    {
        this.termostato = new Termostato();
        this.ligado = false;
    }

    public boolean getLigado()
    {
        return ligado;
    }
    public Termostato getTermostato()
    {
        return termostato;
    }

    public boolean ligar()
    {
        return ligado = true;
    }
    public boolean desligar()
    {
        return ligado = false;
    }

    public void aumentarTemperatura()
    {
        if(ligado && termostato.getTemperatura() < 28)
        {
            termostato.setTemperatura(termostato.getTemperatura() +1);
        }
        else
        {
            throw new IllegalArgumentException("erro");
        }

    }
    public void diminuirTemperatura()
    {
        if (ligado && termostato.getTemperatura() > 15)
        {
            termostato.setTemperatura(termostato.getTemperatura() -1);
        }
        else
        {
            throw new IllegalArgumentException("erro");
        }
    }

    public int imprimirTemperatura()
    {
        return termostato.getTemperatura();
    }
}