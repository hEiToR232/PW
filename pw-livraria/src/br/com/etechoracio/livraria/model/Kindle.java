package br.com.etechoracio.livraria.model;

public class Kindle extends Livro implements Promocional{
    private String dono;

    @Override
    public double getTempoLeitura() {
        return paginas * 3.3;
    }
    @Override
    public void exibirDetalhes() {
        System.out.println("Dono: "+ dono);
    }

    @Override
    public void aplicarDesconto() {
        preco = preco -2;
    }
}
