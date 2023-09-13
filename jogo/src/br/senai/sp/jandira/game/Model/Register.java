package br.senai.sp.jandira.game.Model;

import java.io.StringReader;
import java.util.Scanner;

public class Register {

    // Instancia Player
    Player player = new Player();

    // Instancia inimigo
    Enemy enemy = new Enemy();

    // Instancia teclado
    Scanner teclado = new Scanner(System.in);

    //Instancia output
    Output output = new Output();

    int ambos = 0;

    public void registerAmbos() {

        ambos = 1;
        registerPlayer();
        registerEnemy();


        output.PrintPlayer(player);
        System.out.println("");
        output.PrintEnemy(enemy);
    }

    public Player registerPlayer() {

        // Instancia teclado
        Scanner teclado = new Scanner(System.in);

        System.out.println("------------ CADASTRO PLAYER ---------------");
        System.out.println("");
        System.out.print("Qual é o seu nome? ");
        player.name = teclado.nextLine();
        System.out.println("Selecione sua skin [Red - Blue - Green] : ");
        player.skin = teclado.nextLine();
        System.out.println("");
        System.out.println("------- Player cadastrado com sucesso ------");

        if (ambos != 1){
            output.PrintPlayer(player);
        }
        return player;
    }

    public Enemy registerEnemy() {

        // Instancia teclado
        Scanner teclado = new Scanner(System.in);

        System.out.println("------------ CADASTRO ENEMY ---------------");
        System.out.println("");
        System.out.print("Qual é o seu nome? ");
        enemy.name = teclado.nextLine();
        System.out.println("Selecione sua skin [Red - Blue - Green] : ");
        enemy.skin = teclado.nextLine();
        System.out.println("------- Enemy cadastrado com sucesso ------");

        if (ambos != 1){
            output.PrintEnemy(enemy);
        }
        return enemy;

    }

    public void Decision() {

        String decision;

        System.out.println("--------------------------------------------------");
        System.out.println("Você deseja cadastrar Player, Enemy ou ambos?");
        decision = teclado.nextLine();

        switch (decision.toLowerCase()) {
            case "player":
                registerPlayer();
                break;

            case "enemy":
                registerEnemy();
                break;

            case "ambos":
                registerAmbos();
                break;
        }

        System.out.println("");
        System.out.println("Deseja retormar ao cadastro? (s/n)");
        String resp = teclado.nextLine();
        System.out.println("");

        switch (resp.toLowerCase()){

            case "s":
                Decision();
                break;
        }
    }
}
