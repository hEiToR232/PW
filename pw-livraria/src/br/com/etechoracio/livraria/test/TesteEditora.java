package br.com.etechoracio.livraria.test;

import br.com.etechoracio.livraria.model.Editora;

import java.time.LocalTime;

public class TesteEditora {
    public static void main(String[] args) {
        Editora editora = new Editora("", "www.novatec.com");
        editora.setNome("novatec");
        System.out.println(editora.getNome());
    }
}
