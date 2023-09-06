package br.senai.sp.jandira.model;

import java.util.Scanner;

public class CriarTarefas {

    // instanciando tarefa
    Tarefa tarefa = new Tarefa();
    // instancia estado
    Estado estado = new Estado();

    //instancia teclado
    Scanner teclado = new Scanner(System.in);

    int resp;
    public Tarefa cadastrarTarefa(){
        System.out.println("----- CRIANDO TAREFA -----");
        System.out.println("");
        System.out.print("Título: ");
        tarefa.titulo = teclado.nextLine();
        System.out.print("Descrição: ");
        tarefa.descricao = teclado.nextLine();
        System.out.print("Digite uma data para o vencimento da tarefa: ");
        tarefa.dataVenc = teclado.nextLine();
        System.out.println("");
        System.out.println("Estado da tarefa:");
        System.out.println("[1- Concluída]");
        System.out.println("[2- Não concluída]");
        resp = teclado.nextInt();
        teclado.nextLine();
        tarefa.estado = estado.Estado(resp);
        System.out.println("----- TAREFA REGISTRADA -----");

        return tarefa;

    }
}
