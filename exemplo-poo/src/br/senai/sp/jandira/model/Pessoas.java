package br.senai.sp.jandira.model;

public class Pessoas {

    private String nome, apelido;
    private int idade;

    //-------------------------------------------------------------------
    // herança
    public void exibirInformacoes(){
        System.out.println("Nome: " +nome);
        System.out.println("Apelido: " +apelido);
        System.out.println("Idade: " +idade);
        System.out.println("-------------------");
    }


    //------------------------------------------------------------------
    // encapsulamento

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
