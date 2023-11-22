package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Funcionario {

    Scanner scanner = new Scanner(System.in);

    private String nome, cargo, dep;
    private int idFuncionario = 0;
    private double salario;

    public void cadastrarFuncionario(){
        System.out.println("Nome: ");
        this.nome = scanner.nextLine();
        System.out.println("Cargo: ");
        this.cargo = scanner.nextLine();
        System.out.println("Departamento: ");
        this.dep = scanner.nextLine();
        System.out.println("Salário: ");
        this.salario = scanner.nextDouble();
        scanner.nextLine();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
