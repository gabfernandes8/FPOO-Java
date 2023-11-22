package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Funcionario;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    FuncionarioController funcionarioController = new FuncionarioController();

    public void executarMenu() throws SQLException {
        boolean continuar = true;

        while(continuar){
            System.out.println("----- MENU -----");
            System.out.println("1- Cadastrar funcionário");
            System.out.println("2- Listar funcionários");
            System.out.println("3- Deletar funcionário");
            System.out.println("4- Pesquisar funcionário");
            System.out.println("5- Atualizar Salário");
            System.out.println("6- Sair");
            System.out.println("------------------------");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    Funcionario funcionario1 = new Funcionario();
                    funcionario1.cadastrarFuncionario();

                    funcionarioController.cadastrarFuncionario(funcionario1);
                    break;
                case 2:
                    funcionarioController.listarFuncionarios();
                    break;
                case 3:
                    System.out.print("Informe o nome que deseja deletar: ");
                    String nomeDelete = scanner.nextLine();
                    funcionarioController.deletarFuncionario(nomeDelete);
                    break;
                case 4:
                    System.out.print("Informe o nome que deseja pesquisar: ");
                    String nomePesquisa = scanner.nextLine();
                    funcionarioController.pesquisarFuncionario(nomePesquisa);
                    break;
                case 5:
                    System.out.print("Informe o nome que deseja atualizar: ");
                    String nomeSalario = scanner.nextLine();
                    System.out.print("Informe o novo salário: ");
                    double newSalario = scanner.nextDouble();

                    funcionarioController.atualizarSalario(nomeSalario, newSalario);
                    break;
                case 6:
                    break;
            }
        }
    }

}
