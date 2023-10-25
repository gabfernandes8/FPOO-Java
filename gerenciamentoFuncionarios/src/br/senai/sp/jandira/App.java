package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Gerente;
import br.senai.sp.jandira.model.Programador;

public class App {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Ryan Alves", 13, 13000, 9000);
        Programador programador = new Programador("Gabriela Fernandes", 8, 20000, 5);

        System.out.println("----- GERENTE -----");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("ID: " + gerente.getId());
        System.out.println("Salário base: R$ " + gerente.getSalarioBase());
        System.out.println("Bônus de Gerência: " + gerente.getBonus());
        System.out.println("Salário total: R$ " + gerente.calcularSalario());
        System.out.println("");

        System.out.println("----- PROGRAMADOR -----");
        System.out.println("Nome: " + programador.getNome());
        System.out.println("ID: " + programador.getId());
        System.out.println("Salário base: R$ " + programador.getSalarioBase());
        System.out.println("Horas extras: " + programador.getHorasExtra());
        System.out.println("Salário total: R$ " + programador.calcularSalario());
    }
}
