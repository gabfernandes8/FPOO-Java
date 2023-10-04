package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Felinos extends Animais {

    Scanner scanner = new Scanner(System.in);

    public void cadastrarFelino(){
        System.out.println("----- CADASTRO -----");
        System.out.println("");
        System.out.print("Informe a espécie do animal: ");
        super.especie = scanner.nextLine();
        System.out.print("Nome: ");
        super.nome = scanner.nextLine();
        System.out.print("Idade: ");
        super.idade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Sexo: ");
        super.sexo = scanner.nextLine();
        System.out.print("Dieta: ");
        super.dieta = scanner.nextLine();
        System.out.print("Peso: ");
        super.peso = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("-------------------");
    }
}
