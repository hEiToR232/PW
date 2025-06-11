package br.com.etechoracio.livraria.model;

import br.com.etechoracio.livraria.interfaces.Exemplar;
import br.com.etechoracio.livraria.interfaces.Promocional;

public class Carrinho {
    private double valorTotal;

    public void adicionar(Exemplar item){
        if (item instanceof Promocional) {
            ((Promocional) item).aplicarDesconto(new DescontoFixo(2));
        }
        valorTotal += item.getPreco();
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
