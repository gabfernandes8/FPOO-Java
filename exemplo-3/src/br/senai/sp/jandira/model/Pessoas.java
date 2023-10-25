package br.senai.sp.jandira.model;

public class Pessoas extends Conta {

    private String nome;

    // public String nome;
    ///public int idade;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoas(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void passarTempo(){
        System.out.println("A pessoa está passando tempo...");
    }

    public void exibirSaldo(){
        System.out.println(getSaldo());
    }

}
