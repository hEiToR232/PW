// Heitor Sousa
public abstract class ContaBancaria {
    private String numero;
    protected double saldo;

    public void exibirSaldo(){
        System.out.println("Saldo: "+ saldo);
    }
}
