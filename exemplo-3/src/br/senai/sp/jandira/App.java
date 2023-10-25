package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Aluno;
import br.senai.sp.jandira.model.Pessoas;

public class App {
    public static void main(String[] args) {

        // exemplo poo
        Pessoas pessoa1 = new Pessoas("Arthur", 18);
        Pessoas pessoa2 = new Pessoas("Gabriela", 17);

        // exemplo encapsulamento
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa2.getNome());

        // exemplo de herança
        Pessoas aluno1 = new Aluno("Kleber", 30);
        Pessoas aluno2 = new Aluno("Ryan", 30);

        System.out.println(aluno1.getNome());;
        System.out.println(aluno2.getNome());;

        // exemplo polimorfismo
        aluno1.passarTempo();

        // exemplo abstração
        aluno1.exibirSaldo();
    }
}
