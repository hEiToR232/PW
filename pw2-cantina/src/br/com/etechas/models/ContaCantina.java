package br.com.etechas.models;

import br.com.etechas.enums.TipoContaEnum;

public class ContaCantina {
    private TipoContaEnum tipoConta;
    private double saldo;
    private double limite;
    private double saldoMinimo;

    /*1.5 - Inclua um construtor que receba, ao criar um objeto do tipo
     ContaCantina, um saldo como parâmetro, altere o saldo conforme
     valor recebido, além do tipo de conta para ALUNO e o saldo mínimo
     de alerta para 10 reais. Exemplo: new ContaCantina(100.0);*/

    public ContaCantina(double saldo) {
        this.saldo = saldo;
        this.tipoConta = TipoContaEnum.ALUNO;
        this.saldoMinimo = 10;
    }

    /*1.6 - Inclua um outro construtor que receba, ao criar um objeto
    do tipo ContaCantina, um tipo de conta e um saldo como parâmetros,
    altere o tipo de conta e o saldo conforme valores recebidos e
    verifique se o tipo de conta for PROFESSOR, que terá um limite
    a mais de 100 reais para consumir.
    Exemplo: new ContaCantina(TipoContaEnum.DIRETOR, 100.0);*/
    //+ ContaCantina(tipoConta: TipoContaEnum, saldo: double)

    public ContaCantina(TipoContaEnum tipoConta, double saldo){
        this.tipoConta = tipoConta;
        this.saldo = saldo;
        if(this.tipoConta.equals(TipoContaEnum.PROFESSOR)){
            this.limite += 100;
        }
    }

    /*1.7 - O método emitirAlertaSaldoBaixo() verificará se o saldo
                 da conta é menor ou igual ao saldo mínimo configurado
                  e, caso verdadeiro, exibirá a mensagem “ALERTA DE
                  SALDO BAIXO: R$ 15.00”, senão exibirá a mensagem
                  “Saldo: R$ 15.00”, onde 15.00 é o valor do saldo atual.
    */
    public void emitirAlertaSaldoBaixo(){
        if(this.saldo <= this.saldoMinimo)
            System.out.println("ALERTA DE SALDO BAIXO: R$ " + this.saldo);
        else
            System.out.println("Saldo: R$ " + this.saldo);
    }

    /*1.8 O método debitar() funcionará da seguinte maneira:
        • Se o titular for um Diretor, o valor será debitado do saldo
        normalmente;
        • Se o titular for um Professor, o valor será debitado caso
        seja menor ou igual ao saldo ou não ultrapasse a soma do saldo
        com o limite disponível;
        • Se o titular for um Aluno, o valor será debitado apenas se
         for menor ou igual ao saldo.
        Caso contrário, exibirá a mensagem “Conta sem saldo suficiente”. Nos casos em que o saldo for debitado, será feita a checagem de alerta de saldo baixo.*/
    public void debitar(double valor){
        if(tipoConta.equals(TipoContaEnum.DIRETOR)){
            saldo -= valor; //saldo = saldo - valor;
        }else if(tipoConta.equals(TipoContaEnum.PROFESSOR)){
            if(valor <= saldo || valor <= saldo+limite){
                saldo -= valor;
            }
        } else if (tipoConta.equals(TipoContaEnum.ALUNO) && valor <= saldo) {
            saldo -= valor;
        }else{
            System.out.println("Conta sem saldo suficiente");
        }
        emitirAlertaSaldoBaixo();
    }
    /*1.9. O método creditar() adicionará ao saldo atual o valor
                informado como parâmetro e se a conta for de um Aluno,
                um bônus de R$ 5,00 será concedido para créditos superiores a R$ 100,00. Após a atualização,
                será realizada a verificação de alerta para saldo baixo.*/
    public void creditar(double valor){
        saldo += valor;
        if(tipoConta.equals(TipoContaEnum.ALUNO) && valor > 100)
            saldo += 5;
        emitirAlertaSaldoBaixo();
    }
    /*1.10 - Criar um método para alterar o valor do saldo mínimo que
                         também verifique o alerta de saldo baixo.*/
    //+ alterarValorSaldoMinimo(saldoMinimo:double):void
    public void alterarValorSaldoMinimo(double saldoMinimo){
        this.saldoMinimo = saldoMinimo;
        emitirAlertaSaldoBaixo();
    }

}
