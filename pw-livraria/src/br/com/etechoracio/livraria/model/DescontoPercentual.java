package br.com.etechoracio.livraria.model;

import br.com.etechoracio.livraria.interfaces.Desconto;

public class DescontoPercentual implements Desconto {

    private double percentual;

    public DescontoPercentual(double percentual) {
        this.percentual = percentual;
    }

    @Override
    public double aplicar(double preco) {
        return preco - preco * percentual;
    }

}
