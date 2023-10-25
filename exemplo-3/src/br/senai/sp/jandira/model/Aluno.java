package br.senai.sp.jandira.model;

public class Aluno extends Pessoas {
    public Aluno(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void passarTempo() {
        System.out.println("Atividade de Java... ");
    }
}
