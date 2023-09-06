package br.senai.sp.jandira.model;

public class Estado {
    public String Estado(int estadoTarefa){
        String estado = "Não concluída";

        switch (estadoTarefa){
            case 1:
                estado = "Concluída!";
                break;

            case 2:
                estado = "Não concluída";
                break;
        }
        return estado;
    }
}
