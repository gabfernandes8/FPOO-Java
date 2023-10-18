package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Retangulo implements FormasGeometricas{

    Scanner scanner = new Scanner(System.in);

    double alt, larg;
    String resp;

    @Override
    public void calcularArea() {
        System.out.println("Insira os dados da forma:");
        System.out.print("Largura: ");
        larg = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Altura: ");
        alt = scanner.nextDouble();
        scanner.nextLine();

        double area = larg * alt;

        System.out.println("A área do retângulo informado é: " + area);

    }

    @Override
    public void calcularPerimetro() {
        System.out.println("");
        System.out.println("Insira novamente os dados da forma:");
        System.out.print("Largura: ");
        larg = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Altura: ");
        alt = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("");

        double perimetro = alt + alt + larg + larg;

        System.out.println("O perímetro do retângulo informado é: " + perimetro);
        System.out.println("");
    }
}
