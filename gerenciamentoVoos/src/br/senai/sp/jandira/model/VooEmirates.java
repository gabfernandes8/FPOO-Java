package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class VooEmirates extends Voo{

    String agencia;

    public VooEmirates(String origem, String destino, String dataPartida, String horaPartida, int numeroVoo, int capacidadePassageiros) {
        super(origem, destino, dataPartida, horaPartida, numeroVoo, capacidadePassageiros);
        this.agencia = "Voo Emirates";
    }

    public String getAgencia() {
        return agencia;
    }
}
