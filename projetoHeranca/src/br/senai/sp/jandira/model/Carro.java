package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Carro extends Veiculos{
    boolean airbag = false;

    Scanner scanner = new Scanner(System.in);

    public void CadastrarCarro(){
        System.out.println("----- CADASTRO -----");
        System.out.println("Informe a marca do veículo: ");
        super.marca = scanner.nextLine();
        System.out.println("Informe o modelo: ");
        super.modelo = scanner.nextLine();
        System.out.println("Informe se tem airbag [true - false]");
        airbag = scanner.nextBoolean();
        System.out.println("--------------------");
    }
}
