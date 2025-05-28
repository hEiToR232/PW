// Heitor Sousa
public class ContaCorrente extends ContaBancaria implements Operavel{
    private double taxaSaque;

    public ContaCorrente(double taxaSaque, double saldo) {
        this.taxaSaque = taxaSaque;
        this.saldo = saldo;
    }

    @Override
    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    @Override
    public void sacar(double valor) {
        if(saldo >= valor + taxaSaque){
            saldo = saldo - (valor + taxaSaque);
        }
        else{
            System.out.println("Saldo insuficiente na Conta Corrente");
        }
    }
}
