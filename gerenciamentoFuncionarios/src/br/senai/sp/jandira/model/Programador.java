package br.senai.sp.jandira.model;

public class Programador extends Funcionario {

    private int horasExtra;

    public Programador(String nome, int id, double salarioBase, int horasExtra){
        super(nome, id, salarioBase);
        this.horasExtra = horasExtra;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (horasExtra * 100);
    }

    public int getHorasExtra() {
        return horasExtra;
    }
}
