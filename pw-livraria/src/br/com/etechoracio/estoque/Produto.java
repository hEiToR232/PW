package br.com.etechoracio.estoque;

public class Produto {

    private String descricao;
    private String genero;
    protected int estoqueDisponivel;
    protected double precoCusto;
    protected double precoVenda;

    public void comprar(int qtde) {
        estoqueDisponivel = estoqueDisponivel + qtde;
    }

    public void vender(int qtde) {
        estoqueDisponivel -= qtde;
        //estoqueDisponivel = estoqueDisponivel - qtde;
    }

    public void calcularPrecoVenda() {
        this.precoVenda = precoCusto * 1.1;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public void setEstoqueDisponivel(int estoqueDisponivel) {
        this.estoqueDisponivel = estoqueDisponivel;
    }
}
