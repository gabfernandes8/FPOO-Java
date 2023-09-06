package br.senai.sp.jandira.model;

import java.util.*;
public class ListarTarefas {

    Scanner teclado = new Scanner(System.in);

    List <Tarefa> Tarefas = new ArrayList<>();

    public void AdicionarTarefa(Tarefa tarefa){
        Tarefas.add(tarefa);
    }

    public void Listar(){
        for (Tarefa tarefa : Tarefas){
            System.out.println(tarefa.titulo);
            System.out.println(tarefa.descricao);
            System.out.println(tarefa.dataVenc);
            System.out.println(tarefa.estado);
            System.out.println("");
        }
    }

    public void editarTarefa(){
        System.out.println("Escolha uma opção:");
        System.out.println("[1- Editar tarefa]");
        System.out.println("[2- Excluir tarefa]");
        System.out.println("");

        int resp = teclado.nextInt();

        if (resp == 1){

        } else if (resp == 2){

            System.out.println("O que você deseja remover?");
            System.out.println("[1 - Todas as tarefas]");
            System.out.println("[2 - (número da tarefa)]");
            int respExcluir

            if (respExcluir == 1){
                Tarefas.clear();
                System.out.println("Todas as tarefas foram apagadas.");
            } else if (respExcluir == 2){
                System.out.println("Qual tarefa?");

            }

        }
    }

}
