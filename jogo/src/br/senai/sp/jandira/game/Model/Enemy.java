package br.senai.sp.jandira.game.Model;

public class Enemy {

    public String name;
    public String skin;
    public int life;

    public Enemy(){
        life = 100;
    }

    public int GetLife(){
        return life;
    }

    public void SubtrairVida(int danoPlayer){

        life -= danoPlayer;

        if(life < 0){
            life = 0;
        }
    }

    public void ReiniciarVida(){
        life = 100;
    }

}
