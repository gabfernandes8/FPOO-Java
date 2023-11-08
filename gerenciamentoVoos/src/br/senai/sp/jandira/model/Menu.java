package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    List<Voo> voos = new ArrayList<>();
    List<Voo> voosPesquisa = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void mostrarVoos(List<Voo> voos) {

        for (Voo voo : voos) {
            System.out.println("Número do Voo: " + voo.getNumeroVoo());
            System.out.println("Capacidade de Passageiros: " + voo.getCapacidadePassageiros());
            System.out.println("Origem: " + voo.getOrigem());
            System.out.println("Destino: " + voo.getDestino());
            System.out.println("Data de Partida: " + voo.getDataPartida());
            System.out.println("Horário de Partida: " + voo.getHoraPartida());
            System.out.println("-----------------------------------");
            System.out.println("");
        }

    }

    public void cadastrarVoos() {

        Gol voo1 = new Gol("Brasil", "Itália", "08-08-2023", "04:30", 8806, 50);
        voos.add(voo1);
        Gol voo2 = new Gol("São Paulo", "Maranhão", "24-12-2024", "06:00", 2404, 60);
        voos.add(voo2);
        Gol voo3 = new Gol("Rio de Janeiro", "Palmas", "31-10-2022", "08:45", 3456, 50);
        voos.add(voo3);

        VooEmirates voo4 = new VooEmirates("Londres", "Escócia", "02-11-2023", "09:50", 6666, 1);
        voos.add(voo4);
        VooEmirates voo5 = new VooEmirates("Canadá", "Japão", "26-02-2023", "10:30", 2412, 5);
        voos.add(voo5);
        VooEmirates voo6 = new VooEmirates("Florianópolis", "Porto Alegre", "15-07-2020", "11:00", 1507, 50);
        voos.add(voo6);

        VooDelta voo7 = new VooDelta("Sydney", "Salvador","19-12-2021", "11:45", 1912, 45);
        voos.add(voo7);
        VooDelta voo8 = new VooDelta("Nova York", "Toronto", "25-04-2019", "12:20", 2504, 75);
        voos.add(voo8);
        VooDelta voo9 = new VooDelta("Paris", "Roma","19-09-2023", "12:50", 1909, 45);
        voos.add(voo9);

    }

    public void pesquisarVoo(String pesquisa) {

        voosPesquisa.clear();
        int numeroVoo = 0;

        try {
            numeroVoo = Integer.parseInt(pesquisa);
            System.out.println(numeroVoo);
        } catch (Exception erro) {
        }

        for (Voo voo : voos) {

            String origem = voo.getOrigem(), destino = voo.getDestino();
            int nvoo = voo.getNumeroVoo();
            String data = voo.getDataPartida();

            if (pesquisa.equalsIgnoreCase(origem)){
                voosPesquisa.add(voo);
            } else if (pesquisa.equalsIgnoreCase(destino)) {
                voosPesquisa.add(voo);
            } else if (numeroVoo == nvoo) {
                voosPesquisa.add(voo);
            } else if(pesquisa.equalsIgnoreCase(data)){
                voosPesquisa.add(voo);
            }

        }
    }

        public void mostrarMenu() {

            boolean continuar = true;

            while (continuar) {

                System.out.println("----- MENU -----");
                System.out.println("1- Mostrar Voos");
                System.out.println("2- Pesquisar Voo");
                System.out.println("3- Sair");
                System.out.println("----------------");
                int resp = scanner.nextInt();
                scanner.nextLine();
                System.out.println("");

                switch (resp) {
                    case 1:
                        mostrarVoos(voos);
                        break;

                    case 2:
                        System.out.println("Pesquise pelo Número do Voo, Origem, Destino ou Data de Partida");
                        pesquisarVoo(scanner.nextLine());
                        System.out.println("");
                        if (voosPesquisa.size() >= 1) {
                            mostrarVoos(voosPesquisa);
                        } else {
                            System.out.println("Voo não encontrado...");
                        }
                        break;

                    case 3:
                        continuar = false;
                        break;
                }

            }

        }

    }

