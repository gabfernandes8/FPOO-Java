package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {

    boolean continuar = true;
    Aves referenciaAve = new Aves();
    Repteis referenciaReptil = new Repteis();
    Felinos referenciaFelino = new Felinos();
    Animais referenciaAnimal = new Animais();
    int respUsuario, resp;

    Scanner scanner = new Scanner(System.in);

    public void menuZoologico(){

        while(continuar){
            System.out.println("----- BEM VINDO ZOOLÓGICO SENAI -----");
            System.out.println("O que você deseja cadastrar?");
            System.out.println("[1 - Cadastrar animal]");
            System.out.println("[2 - Exibir animais]");
            resp = scanner.nextInt();
            scanner.nextLine();

            switch (resp){
                case 1:
                    System.out.println("");
                    System.out.println("Cadastrar:");
                    System.out.println("[1 - Ave]");
                    System.out.println("[2 - Réptil]");
                    System.out.println("[1 - Felino]");
                    respUsuario = scanner.nextInt();
                    scanner.nextLine();

                    switch (respUsuario){
                        case 1:
                            Aves ave = new Aves();
                            ave.cadastrarAnimal();
                            referenciaAnimal.adicionarAnimais(ave);
                            break;

                        case 2:
                            referenciaReptil.cadastrarAnimal();
                            break;

                        case 3:
                            referenciaFelino.cadastrarAnimal();
                            break;
                    }

                case 2:
                    referenciaAnimal.listarAnimais();
                    break;
            }
        }

    }

}
