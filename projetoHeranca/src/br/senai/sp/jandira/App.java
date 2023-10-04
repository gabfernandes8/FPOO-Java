package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Carro;

public class App {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.CadastrarCarro();
        carro.acelerar();
        carro.freiar();
    }
}
