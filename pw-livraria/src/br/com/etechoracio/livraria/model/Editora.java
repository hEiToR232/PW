package br.com.etechoracio.livraria.model;

public class Editora {

    private String nome;
    private String site;
    //Alterar o nome
    public void setNome(String nome){
        this.nome = nome.toUpperCase();
    }
    public String getNome(){
        return nome;
    }
    //Construtor
    public Editora(String nome){

        this.nome = nome.toUpperCase();
    }
    public Editora(String nome, String site){
        this.nome = nome.toUpperCase();
        this.site = site.toLowerCase();
    }

}
