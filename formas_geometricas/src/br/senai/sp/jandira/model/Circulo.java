package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Circulo implements FormasGeometricas{

    Scanner scanner = new Scanner(System.in);

    double raio;

    @Override
    public void calcularArea() {
        System.out.print("Informe o raio do círculo: ");
        raio = scanner.nextDouble();
        scanner.nextLine();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("");
        System.out.printf("A área do círculo informado é: %.2f %n", area);
        System.out.println("");
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("Informe o raio do círculo: ");
        raio = scanner.nextDouble();
        scanner.nextLine();

        double perimetro = 2 * Math.PI * raio;

        System.out.println("");
        System.out.printf("O perímetro do círculo informado é: %.2f %n", perimetro);
        System.out.println("");
    }
}
