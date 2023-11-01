package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class VooDelta extends Voo{

    String agencia;

    public VooDelta(String origem, String destino, String dataPartida, String horaPartida, int numeroVoo, int capacidadePassageiros) {
        super(origem, destino, dataPartida, horaPartida, numeroVoo, capacidadePassageiros);
        this.agencia = "Voo Delta";
    }
}
