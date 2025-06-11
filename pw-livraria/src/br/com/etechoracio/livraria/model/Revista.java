package br.com.etechoracio.livraria.model;

import br.com.etechoracio.livraria.interfaces.Desconto;
import br.com.etechoracio.livraria.interfaces.Exemplar;
import br.com.etechoracio.livraria.interfaces.Promocional;

public class Revista implements Exemplar, Promocional {
    private String titulo;
    private Editora editora;
    private double preco;

    @Override
    public double getPreco() {
        return preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public void aplicarDesconto(Desconto desconto) {
        preco = desconto.aplicar(preco);
    }
}
