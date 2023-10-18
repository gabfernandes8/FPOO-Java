package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Caminhao;
import br.senai.sp.jandira.model.Jetski;

public class Main {

    public static void main(String[] args) {

        Caminhao caminhao = new Caminhao();
        Jetski jetski = new Jetski();

        caminhao.acelerar();
        jetski.buzinar();
        caminhao.freiar();
        jetski.acelerar();
        caminhao.buzinar();
        jetski.freiar();

    }

}
