package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {
    Scanner teclado = new Scanner(System.in);
    ListarTarefas listar = new ListarTarefas();

    public void Menu(){
        boolean continuar = true;

        while(continuar){
            CriarTarefas criarTarefa = new CriarTarefas();

            System.out.println("----- BEM VINDO -----");
            System.out.println("Escolha uma opção");
            System.out.println("[1 - Criar Tarefa]");
            System.out.println("[2- Listar Tarefas]");
            System.out.println("[3- Editar Tarefa]");
            System.out.println("[4- Sair]");
            System.out.println("----------------------");

            int opcaoUsuario = teclado.nextInt();

            switch (opcaoUsuario){
                case 1:
                    Tarefa tarefa = criarTarefa.cadastrarTarefa();
                    listar.AdicionarTarefa(tarefa);
                    break;

                case 2:
                    listar.Listar();
                    break;

                case 3:
                    listar.editarLista();
                    break;
            }
        }
    }

}
