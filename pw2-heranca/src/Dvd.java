public class Dvd extends Produto{
    private String diretor;
    private String duracao;
    private String censura;

    public void listarProduto(){}
    public void calcularPrecoVenda(double cotacaoDolar){
        precoVenda = precoVenda * cotacaoDolar;
    }
}
