package br.senai.sp.jandira.game.Model;

import java.util.Scanner;

public class Battle {

    String scenarioBattle;

    Scanner teclado = new Scanner(System.in);

    // instancia scenario
    Scenario scenario = new Scenario();

    public void ChoiceScenario(){
        System.out.println("------------------------------------");
        System.out.println("        Escolha um cenário:         ");
        System.out.println("[1- Londres 2- Grecia 3- Los Angeles");
        System.out.println("4- Rio de Janeiro 5- Tóquio 6- Berlim]");
        System.out.println("-------------------------------------");

        int userScenario = teclado.nextInt();

        scenarioBattle = scenario.Scenario(userScenario);
        System.out.println(scenarioBattle);
    }

    public void Battle (Player player, Enemy enemy){

        while (true) {

            int lifePlayer = player.GetLife();
            int lifeEnemy = enemy.GetLife();

            if (lifePlayer == 0) {
                System.out.println("O vencedor é o ENEMY " + enemy.name);
                break;
            } else if (lifeEnemy == 0) {
                System.out.println("O vencedor é o PLAYER " + player.name);
                break;
            }

            System.out.println("-------------- BATTLE --------------");
            System.out.println("Ataque Player [ H ] - " + player.name + " life " + lifePlayer);
            System.out.println("Ataque Enemy [ S ] - " + enemy.name+ " life " + lifeEnemy);
            System.out.println("------------------------------------");

            String attack = teclado.next();

            if (attack.equalsIgnoreCase("H")) {
                System.out.println("Player atacou!");
                System.out.println("Enemy defende! [ D ]");
                String defense = teclado.next();

                int danoPlayer = (int) (Math.random() * 20) + 1;

                if (defense.equalsIgnoreCase("D")) {
                    int defesa = (int) (Math.random() * 5) + 1;

                    enemy.SubtrairVida(danoPlayer);
                    System.out.println("O ataque foi de: " + danoPlayer);
                    System.out.println("A defesa foi de: " + defesa);

                } else {
                    enemy.SubtrairVida(danoPlayer);
                    System.out.println("O ataque foi de: " + danoPlayer);
                }

            } else if (attack.equalsIgnoreCase("S")) {
                System.out.println("Enemy atacou!");
                System.out.println("Player defende! [ D ]");
                String defense = teclado.next();

                int danoEnemy = (int) (Math.random() * 20) + 1;

                if (defense.equalsIgnoreCase("D")) {
                    int defesa = (int) (Math.random() * 5) + 1;

                    player.SubtrairVida(danoEnemy);
                    System.out.println("O ataque foi de: " + danoEnemy);
                    System.out.println("A defesa foi de: " + defesa);

                } else {
                    player.SubtrairVida(danoEnemy);
                    System.out.println("O ataque foi de: " + danoEnemy);
                }

            } else {
                System.out.println("Tecla inválida!");
            }

        }

    }

}
