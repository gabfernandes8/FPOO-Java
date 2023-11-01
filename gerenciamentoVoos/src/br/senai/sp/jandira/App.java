package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Gol;
import br.senai.sp.jandira.model.VooDelta;
import br.senai.sp.jandira.model.VooEmirates;

public class App {
    public static void main(String[] args) {

        Gol voo1 = new Gol("Brasil", "Itália", "08-08-2023", "04:30", 8806, 50);
        voo1.adicionarVoo(voo1);
        Gol voo2 = new Gol("São Paulo", "Maranhão", "24-12-2024", "06:00", 2404, 60);
        voo2.adicionarVoo(voo2);
        Gol voo3 = new Gol("Rio de Janeiro", "Palmas", "31-10-2022", "08:45", 3456, 50);
        voo3.adicionarVoo(voo3);

        VooEmirates voo4 = new VooEmirates("Londes", "Escócia", "02-11-2023", "09:50", 6666, 1);
        VooEmirates voo5 = new VooEmirates("Canadá", "Japão", "26-02-2023", "10:30", 2412, 5);
        VooEmirates voo6 = new VooEmirates("Florianópolis", "Porto Alegre", "15-07-2020", "11:00", 1507, 50);

        VooDelta voo7 = new VooDelta("Portugal", "Sydney", "19-12-2021", "11:45", 1912, 45);
        VooDelta voo8 = new VooDelta("Califórnia", "Nova York", "25-04-2019", "12:20", 2504, 75);
        VooDelta voo9 = new VooDelta("Nova York", "Paris", "19-09-2023", "12:50", 1909, 45);

        System.out.println();

    }
}
