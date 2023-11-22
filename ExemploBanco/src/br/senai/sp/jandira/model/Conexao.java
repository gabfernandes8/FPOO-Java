package br.senai.sp.jandira.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    String banco, servidor, senha, usuario;

    public Connection conexao;

    public Conexao(){
        this.servidor = "localhost";
        this.banco = "db_empresa";
        this.usuario = "root";
        this.senha = "bcd127";
    }

    // valida se o banco está no ar retornando true ou false
    // try = tenta executar o codigo
    // catch = captura erro e trata ele diretamente
    public boolean conectDrive(){
        try{
            this.conexao = DriverManager.getConnection("jdbc:mysql://" +
                    this.servidor + "/" + this.banco, this.usuario, this.senha);
            return true;
        } catch (Exception erro){
            System.out.println(erro);
            return false;
        }
    }

    public Connection getConnection(){
        conectDrive();
        return conexao;
    }

}
