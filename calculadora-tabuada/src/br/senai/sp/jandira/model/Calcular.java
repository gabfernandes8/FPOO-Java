package br.senai.sp.jandira.model;

public class Calcular {
    int cInicial, cFinal, tabuada, resultado;

    public void calcularTabuada(){

        if (cInicial == null || cFinal == null || tabuada == null) {
            System.out.println("É necessário inserir os dois valores para serem calculados");
        } else if (cFinal < cInicial) {
            cFinal = cInicial;
            cInicial = cFinal;
        }

        while (cInicial <= cFinal){
            resultado = tabuada * cInicial;

            System.out.println(tabuada + " x " + cInicial + " = " + resultado);
            cInicial++;
        }

    }
}
