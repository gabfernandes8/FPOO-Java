package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Cliente {
    public String nome;
    public long cpf, rg, telefone;
    Scanner scanner = new Scanner(System.in);
    public void cadastrarCliente(){

        System.out.println("----- CADASTRO CLIENTE -----");
        System.out.print("Informe seu nome: ");
        nome = scanner.nextLine();
        System.out.print("Informe seu CPF: ");
        cpf = scanner.nextLong();
        System.out.print("Informe seu RG: ");
        rg = scanner.nextLong();
        System.out.print("Informe seu telefone: ");
        telefone = scanner.nextLong();
        scanner.nextLine();
        System.out.println("----------------------------");
    }
}