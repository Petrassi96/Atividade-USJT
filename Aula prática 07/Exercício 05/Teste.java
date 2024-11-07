public class Teste
{
    public static void main (String []args)
    {
        ItemCarrinho item1 = new ItemCarrinho()
        {
            public String getDescricao()
            {
                return "Tênis";
            }
            public double getPreco()
            {
                return 350.00;
            }
        };

        ItemCarrinho item2 = new ItemCarrinho()
        {
            public String getDescricao()
            {
                return "Calça";
            }
            public double getPreco()
            {
                return 149.99;
            }
        };

        ItemCarrinho item3 = new ItemCarrinho() 
        {
            public String getDescricao()
            {
                return "Meia";
            }
            public double getPreco()
            {
                return 19.99;
            }
        };

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionaItem(item1);
        carrinho.adicionaItem(item2);
        carrinho.adicionaItem(item3);

        System.out.println("Itens no carrinho:");
        carrinho.exibeItens();

        double total = carrinho.calculaTotal();
        System.out.println("\nTotal do carrinho: R$ " + total);

        carrinho.removeItem(item3);
        System.out.println("\nItens no carrinho após remoção:");
        carrinho.exibeItens();

        total = carrinho.calculaTotal();
        System.out.println("\nNovo total do carrinho: R$ " + total);
    }
}
