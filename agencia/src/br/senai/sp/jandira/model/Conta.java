package br.senai.sp.jandira.model;

public class Conta {
    private int numeroConta = 1234;
    private double saldo = 9652;
    private String agencia = "Inter";

    public void realizarDeposito(double valor){
        this.saldo += valor;
        System.out.println("O saldo da conta é: " + this.saldo);
    }

    public void realizarSaque(double valor){

        if (valor <= saldo){
            this.saldo -= valor;
            System.out.println("O saldo da conta é: " + this.saldo);

        } else {
            System.out.println("Você não tem dinheiro o suficiente para realizar essa ação.");
        }
    }

    public void consultarSaldo(){
        System.out.println("Seu saldo é: " + this.saldo);
    }

}
