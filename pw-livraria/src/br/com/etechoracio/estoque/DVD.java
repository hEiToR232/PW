package br.com.etechoracio.estoque;

public class DVD extends Produto {

    private String diretor;
    private String duracao;
    private String censura;

    public void listarProduto() {
        System.out.println("Diretor: " + diretor);
        System.out.println("Estoque: " + estoqueDisponivel);
        System.out.println("Preço de Venda: " + precoVenda);
        System.out.println("blá blá blá do DVD");
        System.out.println("-------------------------------");
    }

    public void calcularPrecoVenda(double cotacaoDolar) {
        this.precoVenda = precoCusto * cotacaoDolar;
    }

}
