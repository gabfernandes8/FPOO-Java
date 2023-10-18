package br.senai.sp.jandira.model;

public class Jetski implements Veiculo {

    @Override
    public void freiar() {
        System.out.println("O jetski está freiando");
    }

    @Override
    public void acelerar() {
        System.out.println("O jetski está acelerando");
    }

    @Override
    public void buzinar() {
        System.out.println("O jetski está buzinando");
    }
}
