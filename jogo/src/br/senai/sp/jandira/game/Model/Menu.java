package br.senai.sp.jandira.game.Model;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Menu {

    Scanner teclado = new Scanner(System.in);

    // instancia register
    Register register = new Register();

    Battle battle = new Battle();

    public void Menu(){

        boolean continuar = true;

        while(continuar){
            System.out.println("--------------- BEM-VINDO -------------");
            System.out.println("Escolha uma opção: ");
            System.out.println("[1- Register 2- Battle 3- Exit]");
            System.out.println("---------------------------------------");

            int userOption = teclado.nextInt();

            switch (userOption){
                case 1:
                    register.Decision();
                    break;

                case 2:
                    battle.ChoiceScenario();
                    battle.Battle(register.player, register.enemy);
                    register.player.ReiniciarVida();
                    register.enemy.ReiniciarVida();
                    break;

                case 3:
                    continuar = false;
                    break;
            }
        }
    }

}
