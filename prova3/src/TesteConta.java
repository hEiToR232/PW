// Heitor Sousa
public class TesteConta {
    public static void main(String[] args) {
        Transacao transacao = new Transacao();
        ContaCorrente contaCorrente = new ContaCorrente(1,1000);
        transacao.aplicar(contaCorrente, 100, true);
        transacao.aplicar(contaCorrente, 500, false);
        contaCorrente.exibirSaldo();

        ContaPoupanca contaPoupanca = new ContaPoupanca(1000);
        transacao.aplicar(contaPoupanca, 100, false);
        transacao.aplicar(contaPoupanca, 50, true);
        contaPoupanca.exibirSaldo();

        ContaEmpresarial contaEmpresarial = new ContaEmpresarial(500, 1000);
        transacao.aplicar(contaEmpresarial, 1200, false);
        transacao.aplicar(contaEmpresarial, 500, true);
        contaEmpresarial.exibirSaldo();
    }
}
