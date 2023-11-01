package br.senai.sp.jandira.model;

import java.util.*;

abstract class Voo {
    private int numeroVoo, capacidadePassageiros;
    private String origem, destino;
    private String dataPartida;
    private String horaPartida;

    public Voo (String origem, String destino, String dataPartida, String horaPartida, int numeroVoo, int capacidadePassageiros){
        this.origem = origem;
        this.destino = destino;
        this.dataPartida = dataPartida;
        this.horaPartida = horaPartida;
        this.numeroVoo = numeroVoo;
        this.capacidadePassageiros = capacidadePassageiros;
    }

    List <Voo> voos = new ArrayList<>();

    public void adicionarVoo(Voo voo){
        voos.add(voo);
    }

    public int getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(int numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(String dataPartida) {
        this.dataPartida = dataPartida;
    }

    public String getHoraPartida() {
        return horaPartida;
    }

    public void setHoraPartida(String horaPartida) {
        this.horaPartida = horaPartida;
    }
}
