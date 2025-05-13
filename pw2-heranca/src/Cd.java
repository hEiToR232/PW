public class Cd extends Produto{
    private String artista;
    private String gravadora;
    private String paisOrigem;

    public void listarProduto(){}
    @Override
    public void calcularPrecoVenda(){
        precoVenda = precoCusto * 0.15;
    }
}
