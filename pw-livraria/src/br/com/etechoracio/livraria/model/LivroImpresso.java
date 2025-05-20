package br.com.etechoracio.livraria.model;

import br.com.etechoracio.livraria.enums.TipoCapaEnum;

public class LivroImpresso extends Livro implements Promocional {
    private TipoCapaEnum tipoCapa;

    public LivroImpresso(){
        tipoCapa = TipoCapaEnum.COMUM;
        System.out.println("Tipo de capa do livro cadastrado em 29/04: " + tipoCapa);
    }

    public double calcularFrete(){
        return preco * 0.05;
    }
    public double calcularFrete(double percentual){

        return preco * percentual/100;
    }


    @Override
    public void exibirDetalhes() {
        System.out.println("Tipo de capa: " + tipoCapa);
        System.out.println("Frete: " + calcularFrete());

    }

    @Override
    public void aplicarDesconto(Desconto desconto) {
        preco = desconto.aplicar(preco);
    }
}
