package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Conexao;
import br.senai.sp.jandira.model.Funcionario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioController {

    Conexao conexao = new Conexao();
    Connection connection = conexao.getConnection();

    public void listarFuncionarios() throws SQLException {
        Statement statement = connection.createStatement();
        String queryConsulta = "select * from funcionarios";

        statement.executeQuery(queryConsulta);

        ResultSet resultSet = statement.executeQuery(queryConsulta);
        Funcionario funcionario = new Funcionario();

        while(resultSet.next()){
            funcionario.setIdFuncionario(resultSet.getInt("id_funcionario"));
            funcionario.setNome(resultSet.getString("nome"));
            funcionario.setCargo(resultSet.getString("cargo"));
            funcionario.setDep(resultSet.getString("departamento"));
            funcionario.setSalario(resultSet.getDouble("salario"));

            System.out.println(funcionario.getIdFuncionario());
            System.out.println(funcionario.getNome());
            System.out.println(funcionario.getCargo());
            System.out.println(funcionario.getDep());
            System.out.println(funcionario.getSalario());
            System.out.println("");
        }
    }

    public void deletarFuncionario(String nome) throws SQLException {
        Statement statement = connection.createStatement();

        String queryDelete = "delete from funcionarios where nome='" + nome + "'";

        statement.executeUpdate(queryDelete);
        System.out.println("Usuário " + nome + " deletado com sucesso!");
    }

    public void atualizarSalario(String nome, double salario) throws SQLException {
        Statement statement = connection.createStatement();
        String queryAtualizar = "update funcionarios set salario = " + salario + " where nome=" + nome + "'";

        statement.executeUpdate(queryAtualizar);
        System.out.println("Dados atualizados com sucesso!");
    }

    public void pesquisarFuncionario(String nome) throws SQLException {
        Statement statement = connection.createStatement();
        String queryPesquisa = "select from funcionarios where nome='" + nome + "'";
        ResultSet resultSet = statement.executeQuery(queryPesquisa);
        List<Funcionario> ListPesquisa = new ArrayList<>();

        while (resultSet.next()){
            Funcionario funcionario = new Funcionario();

            funcionario.setIdFuncionario(resultSet.getInt("id_funcionario"));
            funcionario.setNome(resultSet.getString("nome"));
            funcionario.setCargo(resultSet.getString("cargo"));
            funcionario.setDep(resultSet.getString("departamento"));
            funcionario.setSalario(resultSet.getDouble("salario"));

            ListPesquisa.add(funcionario);
        }

        for (Funcionario funcionario : ListPesquisa) {
            System.out.println(funcionario.getIdFuncionario());
            System.out.println(funcionario.getNome());
            System.out.println(funcionario.getCargo());
            System.out.println(funcionario.getDep());
            System.out.println(funcionario.getSalario());
            System.out.println("");
        }
    }

    public void cadastrarFuncionario(Funcionario funcionario) throws SQLException {
        Statement statement = connection.createStatement();

        String queryCadastro = "insert into funcionarios (id_funcionario, nome, cargo, salario, departamento)values (" +
                funcionario.getIdFuncionario() + ", '" + funcionario.getNome() + "', '" + funcionario.getCargo() + "', " +
                funcionario.getSalario() + ", '" + funcionario.getDep() + "')"
                ;

        statement.executeUpdate(queryCadastro);
        System.out.println("Funcionário cadastrado com sucesso!");
    }

}
