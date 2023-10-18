package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Jogador extends Pessoas{

    Scanner scanner = new Scanner(System.in);

    public void cadastrarJogador(){
        System.out.println("Informe o nome: ");
        super.setNome(scanner.nextLine());
        System.out.println("Informe o apelido: ");
        super.setApelido(scanner.nextLine());
        System.out.println("Informe a idade: ");
        super.setIdade(scanner.nextInt());
        scanner.nextLine();
    }

}
