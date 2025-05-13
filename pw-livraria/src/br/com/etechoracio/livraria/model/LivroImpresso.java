package br.com.etechoracio.livraria.model;

import br.com.etechoracio.livraria.enums.TipoCapaEnum;

public class LivroImpresso extends Livro{
    private TipoCapaEnum tipoCapa;

    public LivroImpresso(){
        tipoCapa = TipoCapaEnum.COMUM;
    }

    public double calcularFrete(){
        return preco * 0.05;
    }
    public double calcularFrete(double percentual){

        return preco * percentual/100;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Tipo capa: " + tipoCapa);
    }
}
