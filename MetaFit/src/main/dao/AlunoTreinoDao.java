package main.dao;

import main.model.Treino;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlunoTreinoDao {

    private Connection conn = ConnFactory.getConn();

    public boolean cadastrarAlunoEmTreino(String idAluno, String idTreino) {
        conn = ConnFactory.getConn();
        String sql = "INSERT INTO Aluno_Treino (idAluno, idTreino) VALUES (?, ?)";
        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, idAluno);
            stmt.setString(2, idTreino);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar aluno no treino: " + e.getMessage());
            return false;
        } finally {
            ConnFactory.closeConn(conn, stmt);
        }
    }

    public void removerAlunoDoTreino(String idAluno, String idTreino) {
        conn = ConnFactory.getConn();
        String sql = "DELETE FROM Aluno_Treino WHERE idAluno = ? AND idTreino = ?";
        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, idAluno);
            stmt.setString(2, idTreino);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao remover aluno do treino: " + e.getMessage());
        } finally {
            ConnFactory.closeConn(conn, stmt);
        }
    }

    public ArrayList<Treino> listarTreinosPorAluno(String idAluno) {
        conn = ConnFactory.getConn();
        String sql = """
                SELECT t.idTreino, t.nome, t.descricao, t.especialidades, t.idProfessor, t.instrucoes
                FROM Treino t
                INNER JOIN Aluno_Treino at ON t.idTreino = at.idTreino
                WHERE at.idAluno = ?
                """;
        ArrayList<Treino> treinos = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, idAluno);
            rs = stmt.executeQuery();
                     while (rs.next()) {
                    Treino treino = new Treino(
                            rs.getString("idTreino"),
                            rs.getString("nome"),
                            rs.getString("descricao"),
                            List.of(rs.getString("especialidades").split(",")), // Converte a string para lista
                            rs.getString("idProfessor"),
                            rs.getString("instrucoes")
                    );
                    treinos.add(treino);
                }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar treinos do aluno: " + e.getMessage());
        } finally {
            ConnFactory.closeConn(conn, stmt, rs);
        }

        return treinos;
    }


}
