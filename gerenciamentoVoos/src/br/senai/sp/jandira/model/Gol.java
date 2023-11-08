package br.senai.sp.jandira.model;

    public class Gol extends Voo{

        String agencia;

        public Gol(String origem, String destino, String dataPartida, String horaPartida, int numeroVoo, int capacidadePassageiros) {
            super(origem, destino, dataPartida, horaPartida, numeroVoo, capacidadePassageiros);
            this.agencia = "Gol";
        }

        public String getAgencia() {
            return agencia;
        }

    }
