package org.serratec.persistence;

import org.serratec.conexao.ConnectionFactory;
import org.serratec.entity.Funcionario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDao {
    private Connection conexao;

    public FuncionarioDao() {
        conexao = new ConnectionFactory().getConnection();
    }

    public void inserir(Funcionario funcionario) {
        String sql = "insert into funcionario (nome, email) values (?, ?)";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getEmail());
            stmt.execute();
        } catch (SQLException e) {
            System.err.println("Problema na execução da query");
        }
    }

    public void atualizar(Funcionario funcionario) {
        String sql = "update funcionario set nome = ?, email = ? where id = ?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getEmail());
            stmt.setInt(3, funcionario.getId());
            stmt.execute();
        } catch (SQLException e) {
            System.err.println("Problema na execução da query");
        }
    }

    public void excluir(int codigo) {
        String sql = "delete from funcionario where id = ?";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, codigo);
            stmt.execute();
        } catch (SQLException e) {
            System.err.println("Problema na execução da query");
        }
    }

    public List<Funcionario> listar() {
        String sql = "select * from funcionario";
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                funcionarios.add(new Funcionario(rs.getInt("id"), rs.getString("nome"), rs.getString("email")));
            }
        } catch (SQLException e) {
            System.err.println("Problema na execução da query");
        }
        return funcionarios;
    }

    public Funcionario buscar(int id) {
        String sql = "select * from funcionario where id = ?";
        Funcionario f1 = null;
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                f1 = new Funcionario(rs.getInt("id"), rs.getString("nome"), rs.getString("email"));
            }
        } catch (SQLException e) {
            System.err.println("Problema na execução da query");
        }
        return f1;
    }

    public List<Funcionario> buscarNome(String nome, int tipoBusca) {
        String sql;
        if (tipoBusca == 1) {
            sql = "select * from funcionario where nome like '" + nome + "%'";
        } else if (tipoBusca == 2) {
            sql = "select * from funcionario where nome like '%" + nome + "'";
        } else {
            sql = "select * from funcionario where nome like '%" + nome + "%'";
        }
        List<Funcionario> funcionarios = new ArrayList<>();
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                funcionarios.add(new Funcionario(rs.getInt("id"), rs.getString("nome"), rs.getString("email")));
            }
        } catch (SQLException e) {
            System.err.println("Problema na execução da query");;
        }
        return funcionarios;
    }

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario(2, "Marcelo da Silva", "marcelosilva@gmail.com");
        FuncionarioDao dao = new FuncionarioDao();

//        dao.inserir(f1);
//        dao.atualizar(f1);
//        dao.excluir();
//        System.out.println(dao.listar());
        System.out.println(dao.buscar(2));
    }
}
