package br.com.etechoracio.livraria.model;

public class Revista implements Exemplar, Promocional{
    private String nome;
    private Editora editora;
    private double preco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void aplicarDesconto() {
        preco -= preco * 0.15;
    }
}
