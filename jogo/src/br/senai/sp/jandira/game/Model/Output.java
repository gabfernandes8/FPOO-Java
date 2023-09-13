package br.senai.sp.jandira.game.Model;

public class Output {

    public void PrintPlayer(Player player){
        System.out.println("Player registrado!");
        System.out.println("Nome: " + player.name);
        System.out.println("Skin: " + player.skin);
        System.out.println("Vida: " + player.GetLife());
    }

    public void PrintEnemy(Enemy enemy){
        System.out.println("Enemy registrado!");
        System.out.println("Nome: " + enemy.name);
        System.out.println("Skin: " + enemy.skin);
        System.out.println("Vida: " + enemy.GetLife());
    }

}
