package br.com.etechoracio.estoque;

public class Principal {

    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.setAutor("Rogerio");
        livro.setPrecoCusto(100);
        livro.setEstoqueDisponivel(10);
        livro.comprar(10);
        livro.vender(15);
        livro.calcularPrecoVenda();
        livro.listarProduto();

        CD cd = new CD();
        cd.setPrecoCusto(100);
        cd.setEstoqueDisponivel(10);
        cd.comprar(10);
        cd.vender(15);
        cd.calcularPrecoVenda();
        cd.listarProduto();

        DVD dvd = new DVD();
        dvd.setPrecoCusto(100);
        dvd.setEstoqueDisponivel(10);
        dvd.comprar(10);
        dvd.vender(15);
        dvd.calcularPrecoVenda();
        dvd.listarProduto();

    }

}
