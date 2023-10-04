package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Animais {

    String especie, nome, dieta, sexo;
    int idade, tamanhoLista;
    double peso;
    Scanner scanner = new Scanner(System.in);

    public void cadastrarAnimal(){
        System.out.println("----- CADASTRO -----");
        System.out.println("");
        System.out.print("Informe a espécie do animal: ");
        especie = scanner.nextLine();
        System.out.print("Nome: ");
        nome = scanner.nextLine();
        System.out.print("Idade: ");
        idade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Sexo: ");
        sexo = scanner.nextLine();
        System.out.print("Dieta: ");
        dieta = scanner.nextLine();
        System.out.print("Peso: ");
        peso = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("-------------------");
    }

    List<Animais> lista = new ArrayList<>();
    public void adicionarAnimais(Animais animal){
        lista.add(animal);
        tamanhoLista = lista.size();
    }
    public void listarAnimais(){
        if (!lista.isEmpty()) {
            for (Animais animal : lista) {
                System.out.println("-----------------------------");
                System.out.println("Espécie: " + animal.especie);
                System.out.println("Nome: " + animal.nome);
                System.out.println("Idade: " + animal.idade);
                System.out.println("Sexo: " + animal.sexo);
                System.out.println("Dieta: " + animal.dieta);
                System.out.println("Peso: " + animal.peso);
                System.out.println("");
            }
        }
        else {
                System.out.println("Não existe nenhum animal cadastrado.");
            }
        }

    }

