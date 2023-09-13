package br.senai.sp.jandira.model;

import java.util.*;
public class ListarTarefas {

    Scanner teclado = new Scanner(System.in);

    List <Tarefa> Tarefas = new ArrayList<>();

    int tamanhoList;
    String editado;
    int respEditar;

    Estado estado = new Estado();

    public void AdicionarTarefa(Tarefa tarefa){
        Tarefas.add(tarefa);
        tamanhoList = Tarefas.size();
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

    public void editarLista() {

        if (!Tarefas.isEmpty()) {
            System.out.println("Escolha uma opção:");
            System.out.println("[1- Editar tarefa]");
            System.out.println("[2- Excluir tarefa]");
            System.out.println("-------------------");

            int resp = teclado.nextInt();

            switch (resp){
                case 1:
                    editarTarefas();
                    break;

                case 2:
                    removerTarefas();
                    break;
            }
        }
    }
    public void removerTarefas(){
            System.out.println("O que você deseja remover?");
            System.out.println("[0 - Todas as tarefas]");
            System.out.println("[(número da tarefa)]");
            System.out.println("--------------------");
            int respExcluir = teclado.nextInt();

            if (respExcluir == 0){
                Tarefas.clear();
                System.out.println("Todas as tarefas foram apagadas.");
                System.out.println("--------------------------------");
            } else if (respExcluir <= tamanhoList){
                Tarefas.remove(respExcluir - 1);
            } else {
                System.out.println("Nenhuma tarefa cadastrada.");
            }
        }

    public void editarTarefas(){
        System.out.println("");
        System.out.println("Qual tarefa deseja editar?");
        int respEdicao = teclado.nextInt();
        teclado.nextLine();

        if (respEdicao <= tamanhoList){
            System.out.println("");
            System.out.println("Deseja editar:");
            System.out.println("[1- Título]");
            System.out.println("[2- Descrição]");
            System.out.println("[3- Data de vencimento]");
            System.out.println("[4- Estado]");
            System.out.println("------------------------");
            respEditar = teclado.nextInt();
            teclado.nextLine();
            System.out.println("");
            System.out.println("Qual será a versão atual?");
            editado = teclado.nextLine();
            System.out.println("----- EDIÇÃO REGISTRADA -----");

            Tarefa tarefaEditada = Tarefas.get(respEdicao - 1);

            switch (respEditar){
                case 1:
                    tarefaEditada.titulo = editado;
                    Tarefas.set(respEdicao - 1, tarefaEditada);
                    break;

                case 2:
                    tarefaEditada.descricao = editado;
                    Tarefas.set(respEdicao - 1, tarefaEditada);
                    break;

                case 3:
                    tarefaEditada.dataVenc = editado;
                    Tarefas.set(respEdicao - 1, tarefaEditada);
                    break;

                case 4:
                    int estadoInt = Integer.parseInt(editado);
                    editado = estado.Estado(estadoInt);
                    tarefaEditada.estado = editado;
                    break;
            }
        } else {
            System.out.println("Esta tarefa não existe.");
        }
    }

}
