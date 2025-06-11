package br.com.etechoracio.livraria.model;

import br.com.etechoracio.livraria.interfaces.Desconto;

public class DescontoFixo implements Desconto {

    private double valor;

    public DescontoFixo(double valor) {
        this.valor = valor;
    }

    @Override
    public double aplicar(double preco) {
        return preco - valor;
    }
}
