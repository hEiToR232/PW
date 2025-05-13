public class Produto {
    protected String descricao;
    protected String genero;
    protected int estoqueDisponivel;
    protected double precoCusto;
    protected double precoVenda;

    public void comprar(int qtde){
        estoqueDisponivel += qtde;
    }
    public void vender(int qtde){
        estoqueDisponivel -= qtde;
    }
    public void calcularPrecoVenda(){
        precoVenda += precoCusto * 1.1;
    }
}
