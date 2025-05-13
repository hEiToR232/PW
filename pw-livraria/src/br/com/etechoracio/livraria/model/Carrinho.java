package br.com.etechoracio.livraria.model;

public class Carrinho {
    private double valorTotal;
    public void adicionar(Exemplar item){
        if (item instanceof Promocional){
            ((Promocional) item).aplicarDesconto();
        }
        valorTotal += item.getPreco()
                                               ;
    }
    public double getValorTotal() {
        return valorTotal;
    }
}
