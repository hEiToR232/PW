package br.com.etechoracio.livraria.model;

public class Avaliacao {
    private int estrelas;
    private String comentario;
    private boolean aprovado;

    public Avaliacao(int estrelas, String comentario){
        this.estrelas = estrelas;
        this.comentario = comentario;
    }

    public int getEstrelas() {
        return estrelas;
    }

    public String getComentario() {
        return comentario;
    }

    public boolean isAprovado() {
        return aprovado;
    }
}
