// Heitor Sousa
public class Transacao {
    public void aplicar(Operavel op, double valor, boolean deposito){
        if(deposito){
            op.depositar(valor);
        } else{
            op.sacar(valor);
        }
    }
}
