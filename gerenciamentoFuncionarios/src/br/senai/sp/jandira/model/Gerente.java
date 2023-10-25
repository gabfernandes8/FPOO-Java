package br.senai.sp.jandira.model;

public class Gerente extends Funcionario {

    private double bonus;

    public Gerente(String nome, int id, double salarioBase, double bonus){
        super(nome, id, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonus;
    }

    public double getBonus() {
        return bonus;
    }
}
