package br.com.etechoracio.livraria.test;

import br.com.etechoracio.exeption.TituloInvalidoException;
import br.com.etechoracio.livraria.enums.TipoCapaEnum;
import br.com.etechoracio.livraria.model.*;

import java.sql.SQLOutput;

public class TesteLivros {
    public static void main(String[] args) {
        try {
            //Passar o nome OU passar o nome e o site???
            Editora rocco = new Editora("Rocco");
            //rocco.nome = "Rocco";
            //rocco.site = "rocco.com.br";
            Editora novatec = new Editora("Novatec", "www.novatec.com");

            Kindle primeiroLivro = new Kindle();
            primeiroLivro.setTitulo("Harry Potter");
            primeiroLivro.setAutor("J.K. Rowling");
            primeiroLivro.setEditora(rocco);
            primeiroLivro.setPreco(-35.99);
            primeiroLivro.avaliar(10);
            primeiroLivro.avaliar(9);
            primeiroLivro.avaliar(8);
            primeiroLivro.avaliar(7, "filmetop");
            primeiroLivro.exibir();

            LivroImpresso segundoLivro = new LivroImpresso();
            segundoLivro.setTitulo("UML 2.0");
            segundoLivro.setPreco(50.00);
            segundoLivro.exibir();

            if (primeiroLivro.ehMaisCaroQue(segundoLivro))
                System.out.println(primeiroLivro.getTitulo() +
                        " é mais caro que " + segundoLivro.getTitulo());

            Revista revista = new Revista();
            revista.setTitulo("Revista1");
            revista.setEditora(novatec);
            revista.setPreco(30);

            Carrinho carrinho = new Carrinho();
            carrinho.adicionar(primeiroLivro);
            carrinho.adicionar(segundoLivro);
            carrinho.adicionar(revista);
            System.out.println("Valor total da compra: " +
                    carrinho.getValorTotal());
        } catch (Exception e) {
            System.out.println("Algo deu errado: "+ e.getMessage());;
        }
        }


    }

}
