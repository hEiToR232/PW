// Heitor Sousa
public class ContaPoupanca extends ContaBancaria implements Operavel {

    public ContaPoupanca(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    @Override
    public void sacar(double valor) {
        if(saldo >= valor){
            saldo = saldo - valor;
        }
        else{
            System.out.println("Saldo insuficiente na Conta Corrente.");
        }
    }
}
