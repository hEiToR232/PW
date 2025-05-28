// Heitor Sousa
public class ContaEmpresarial extends ContaBancaria implements Operavel{
    private double limiteCredito;

    public ContaEmpresarial(double limiteCredito, double saldo) {
        this.limiteCredito = limiteCredito;
        this.saldo = saldo;
    }

    @Override
    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    @Override
    public void sacar(double valor) {
        if(saldo + limiteCredito >= valor){
            saldo = saldo - valor;
        }
        else{
            System.out.println("Saldo insuficiente na Conta Empresarial");
        }
    }
}
