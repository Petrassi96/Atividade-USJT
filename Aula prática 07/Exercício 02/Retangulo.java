public class Retangulo extends Forma
 {
    private double largura;
    private double altura;

    public Retangulo(double altura, double largura)
    {
        this.altura = altura;
        this.largura = largura;
    }

    public double calcularArea()
    {
        return largura * altura;
    }

    public double calcularPerimetro()
    {
        return 2 * (largura + altura);
    }
}