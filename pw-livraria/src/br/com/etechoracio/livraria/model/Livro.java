package br.com.etechoracio.livraria.model;

import br.com.etechoracio.exeption.TituloInvalidoException;
import br.com.etechoracio.livraria.interfaces.Exemplar;

import java.util.ArrayList;
import java.util.List;

public abstract class Livro implements Exemplar {
    //tipo nomeAtributo
    private String titulo;
    private String autor;
    private Editora editora;
    protected double preco;
    protected int paginas;
    private List<Avaliacao> avaliacoes = new ArrayList<>();

    public void avaliar(int estrelas){
        avaliacoes.add(new Avaliacao(estrelas, ""));
    }

    public void avaliar(int estrelas, String comentario){
        avaliacoes.add(new Avaliacao(estrelas, comentario));
    }

    public double getMediaAvaliacao(){
        return avaliacoes.stream()
                .filter(av -> av.isAprovado())
                .mapToInt(av -> av.getEstrelas())
                .average()
                .orElse(0.0);
    }

    public void setTitulo(String titulo){
        if(titulo.length() < 2 ){
            throw new TituloInvalidoException("Titulo nao pode ser menor que 2 caracteres");
        }
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
        System.out.println("Número de paginas: " + paginas);
        exibirDetalhes();
        System.out.println("Avaliação: " + getMediaAvaliacao());
        System.out.println("----------------------");
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
        if (preco < 0){
            throw new IllegalArgumentException("Preço não deve ser negativo!");
        }
        this.preco = preco;
    }

    public double getTempoLeitura() {
        return paginas * 2.5;
    }

    public boolean ehMaisCaroQue(Livro outroLivro){
        return preco > outroLivro.preco;
    }

}
