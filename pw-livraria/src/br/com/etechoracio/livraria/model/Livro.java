package br.com.etechoracio.livraria.model;

import br.com.etechoracio.livraria.enums.TipoCapaEnum;

public abstract class Livro implements Exemplar{
    //tipo nomeAtributo
    private String titulo;
    private String autor;
    private Editora editora;
    protected double preco;
    protected int paginas;

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return titulo;
    }

    //Construtor


    //VISIBILIDADE RETORNO NOME( PARAMETROS )
    public void exibir() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Preço: " + preco);
        System.out.println("Numero de Paginas: " + paginas);
        exibirDetalhes();
        System.out.println("--------------------------");
        //System.out.println("Tipo de capa: " + tipoCapa);
        //System.out.println("Frete: " + calcularFrete());
    }
    public abstract void exibirDetalhes();

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getTempoLeitura() {
        return paginas * 2.5;
    }

    public boolean ehMaisCaroQue(Livro outroLivro){
        return preco > outroLivro.preco;
    }




}
