package br.com.catolicapb.Model;

public class ContaCorrente {
    public String numeroDaConta;
    public String nomeDoCorrentista;
    public double saldo = 0;

    public ContaCorrente(
            String numeroDaConta,
            String nomeDoCorrentista
    ){
        this.numeroDaConta = numeroDaConta;
        this.nomeDoCorrentista = nomeDoCorrentista;
    }
    public void alterarNome(String novoNome){
        this.nomeDoCorrentista = novoNome;
        System.out.println("Nome alterado com sucesso!!!");
    }
    public void deposito(double valorDoDeposito){
        this.saldo += valorDoDeposito;
        System.out.println("Deposito efetuado com sucesso!!!, Saldo atual R$$"+this.saldo);
    }

    public void saque(double valorDoSaque){
        if(valorDoSaque > this.saldo){
            System.out.println("Saldo insuficiente :/");
        } else if (valorDoSaque > 0 && valorDoSaque <= this.saldo) {
            this.saldo -= valorDoSaque;
            System.out.println("Saque efetuado com sucesso, Saldo atualizado R$"+this.saldo);
        }else{
            System.out.println("Error... :(");
        }
    }

    public void visualizarSaldo(){
        System.out.println("Saldo atual R$"+this.saldo);
    }
}
