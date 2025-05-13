package br.com.etechoracio.estoque;

public class Livro extends Produto {

    private String autor;
    private String editora;
    private String edicao;

    public void listarProduto() {
        System.out.println("Autor: " + autor);
        System.out.println("Estoque: " + estoqueDisponivel);
        System.out.println("Preço de Venda: " + precoVenda);
        System.out.println("blá blá blá do livro");
        System.out.println("-------------------------------");
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
