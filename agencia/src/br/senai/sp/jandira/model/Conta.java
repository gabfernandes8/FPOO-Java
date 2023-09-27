package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;

public class Conta {
    private int numeroConta = 1234;
    private double saldo = 0;
    private String agencia = "Inter";

    private Cliente cliente;

    List<Conta> listConta = new ArrayList<>();

    public void adicionarContaList(Conta conta){
        listConta.add(conta);
    }

    public Conta pesquisarConta(long cpf){
        for (Conta conta: listConta) {
            long validaCpf = conta.cliente.getCpf();
            if (validaCpf == cpf){
                return conta;
            }
        }
        return null;
    }

    public void gerarConta(Cliente cliente){
        numeroConta = (int) Math.random()*10000;
        this.cliente = cliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

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
