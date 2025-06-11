package br.com.etechoracio.livraria.model;

import br.com.etechoracio.livraria.interfaces.Desconto;
import br.com.etechoracio.livraria.interfaces.Promocional;

public class Kindle extends Livro implements Promocional {
    private String dono;

    @Override
    public double getTempoLeitura() {
        return paginas * 3.3;
    }


    @Override
    public void exibirDetalhes() {
        System.out.println("Dono: " + dono);
    }

    @Override
    public void aplicarDesconto(Desconto desconto) {
        preco = desconto.aplicar(preco);
    }
}
