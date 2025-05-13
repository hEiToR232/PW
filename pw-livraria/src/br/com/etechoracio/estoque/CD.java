package br.com.etechoracio.estoque;

public class CD extends Produto {

    private String artista;
    private String gravadora;
    private String paisOrigem;

    public void listarProduto() {
        System.out.println("Artista: " + artista);
        System.out.println("Estoque: " + estoqueDisponivel);
        System.out.println("Preço de Venda: " + precoVenda);
        System.out.println("blá blá blá do CD");
        System.out.println("-------------------------------");
    }

    public void calcularPrecoVenda() {
        this.precoVenda = precoCusto * 1.15;
    }

}
