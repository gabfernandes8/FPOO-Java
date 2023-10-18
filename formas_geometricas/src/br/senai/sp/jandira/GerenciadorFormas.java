package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Circulo;
import br.senai.sp.jandira.model.Retangulo;

import java.util.Scanner;

public class GerenciadorFormas {
    public static void main(String[] args) {

        int resp;
        Scanner scanner = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();
        Circulo circulo = new Circulo();

        boolean continuar = true;

        while(continuar){
            System.out.println("----- GERENCIADOR DE FORMAS -----");
            System.out.println("");
            System.out.println("Insira a forma geométrica que deseja calcular: ");
            System.out.println("[1 - Retangulo]");
            System.out.println("[2 - Círculo]");
            resp = scanner.nextInt();
            scanner.nextLine();

            switch (resp){
                case 1:
                    retangulo.calcularArea();
                    retangulo.calcularPerimetro();
                    break;

                case 2:
                    circulo.calcularArea();
                    circulo.calcularPerimetro();
                    break;
            }
        }

    }
}
