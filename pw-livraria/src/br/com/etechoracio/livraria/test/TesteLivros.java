package br.com.etechoracio.livraria.test;

import br.com.etechoracio.livraria.enums.TipoCapaEnum;
import br.com.etechoracio.livraria.model.*;

import java.sql.SQLOutput;
import java.time.LocalTime;

public class TesteLivros {

    public static void main(String[] args) {
        //Passar o nome OU passar o nome e o site???
        Editora rocco = new Editora("Rocco");
        //rocco.nome = "Rocco";
        //rocco.site = "rocco.com.br";
        Editora novatec = new Editora("Novatec", "www.novatec.com");

        Kindle primeiroLivro = new Kindle();
        primeiroLivro.setTitulo("Harry Potter");
        primeiroLivro.setAutor("J.K. Rowling");
        primeiroLivro.setEditora(rocco);
        primeiroLivro.setPreco(35.99);
        primeiroLivro.exibir();

        LivroImpresso segundoLivro = new LivroImpresso();
        segundoLivro.setTitulo("UML 2.0");
        segundoLivro.setPreco(21.65);
        segundoLivro.exibir();

        LocalTime tempo = LocalTime.now();
        AudioBook terceiroLivro = new AudioBook();
        terceiroLivro.setTitulo("Corinthians");
        terceiroLivro.setAutor("Socrates");
        terceiroLivro.setPreco(12.54);
        terceiroLivro.setNarrador("Yuri Alberto");
        terceiroLivro.exibir();

        Revista revista = new Revista();
        revista.setPreco(10.99);

        if (primeiroLivro.ehMaisCaroQue(segundoLivro))
            System.out.println(primeiroLivro.getTitulo() + " é mais caro que " + segundoLivro.getTitulo());

        Carrinho carrinho = new Carrinho();
        carrinho.adicionar(primeiroLivro);
        carrinho.adicionar(segundoLivro);
        carrinho.adicionar(terceiroLivro);
        System.out.println("Valor total de " + carrinho.getValorTotal());
    }

}
