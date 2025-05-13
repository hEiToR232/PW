package br.com.etechoracio.livraria.model;

import java.time.LocalTime;

public class AudioBook extends Livro{
    private LocalTime duracao;
    private String narrador;

    public LocalTime getDuracao() {return duracao;}

    public void setDuracao(LocalTime tempo) {this.duracao = duracao;}

    public String getNarrador() {return narrador;}

    public void setNarrador(String narrador) {this.narrador = narrador;}

    @Override
    public void exibirDetalhes() {
        System.out.println("Duração: " + duracao);
        System.out.println("Narrador: " + narrador);
    }
}
