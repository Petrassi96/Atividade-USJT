package main.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import main.model.Treino;

import javax.swing.*;

public class TreinoDao {

    private  Connection conn = ConnFactory.getConn();

    public Treino cadastrarTreino(Treino treino) {
        conn = ConnFactory.getConn();
        String sqlInsert = "INSERT INTO Treino (idTreino, nome, descricao, especialidades, idProfessor, instrucoes) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = null;

        try {
            String id = UUID.randomUUID().toString();
            stmt = conn.prepareStatement(sqlInsert);
            stmt.setString(1, id );
            stmt.setString(2, treino.getNomeTreino());
            stmt.setString(3, treino.getDescricaoTreino());
            stmt.setString(4, String.join(",", treino.getEspecialidadeTreino()));
            stmt.setString(5, treino.getIdProfessor());
            stmt.setString(6, treino.getInstucoes());
            stmt.executeUpdate();

            treino.setId(id);
            return treino;

        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar treino: " + e.getMessage());
        } finally {
            ConnFactory.closeConn(conn, stmt);
        }

        return null;
    }

    public Treino buscarTreino(String idTreino) {
        conn = ConnFactory.getConn();
        String sqlSelect = "SELECT * FROM Treino WHERE idTreino = ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = conn.prepareStatement(sqlSelect);
            stmt.setString(1, idTreino);
            rs = stmt.executeQuery();

            if (rs.next()) {
                return new Treino(
                        rs.getString("idTreino"),
                        rs.getString("nome"),
                        rs.getString("descricao"),
                        Arrays.asList(rs.getString("especialidades").split(",")),
                        rs.getString("idProfessor"),
                        rs.getString("instrucoes")
                );
            }else {
                JOptionPane.showMessageDialog(null,"Treino não encontrado","Erro",JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar treino: " + e.getMessage());
        } finally {
            ConnFactory.closeConn(conn, stmt, rs);
        }
        return null;
    }

    public void atualizarTreino(Treino treino) {
        conn = ConnFactory.getConn();
        String sqlUpdate = "UPDATE Treino SET nome = ?, descricao = ?, especialidades = ?, idProfessor = ?, instrucoes = ? WHERE idTreino = ?";
        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement(sqlUpdate);
            stmt.setString(1, treino.getNomeTreino());
            stmt.setString(2, treino.getDescricaoTreino());
            stmt.setString(3, String.join(",", treino.getEspecialidadeTreino()));
            stmt.setString(4, treino.getIdProfessor());
            stmt.setString(5, treino.getInstucoes());
            stmt.setString(6, treino.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar treino: " + e.getMessage());
        } finally {
            ConnFactory.closeConn(conn, stmt);
        }
    }

    public void excluirTreino(String idTreino) {
        conn = ConnFactory.getConn();
        String sqlDelete = "DELETE FROM Treino WHERE idTreino = ?";
        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement(sqlDelete);
            stmt.setString(1, idTreino);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao excluir treino: " + e.getMessage());
        } finally {
            ConnFactory.closeConn(conn, stmt);
        }
    }

    public ArrayList<Treino> listarTreinos() {
        conn = ConnFactory.getConn();
        String sqlSelect = "SELECT * FROM Treino";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Treino> treinos = new ArrayList<>();

        try {
            stmt = conn.prepareStatement(sqlSelect);
            rs = stmt.executeQuery();

            while (rs.next()) {
                treinos.add(new Treino(
                        rs.getString("idTreino"),
                        rs.getString("nome"),
                        rs.getString("descricao"),
                        Arrays.asList(rs.getString("especialidades").split(",")),
                        rs.getString("idProfessor"),
                        rs.getString("instrucoes")
                ));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar treinos: " + e.getMessage());
        } finally {
            ConnFactory.closeConn(conn, stmt, rs);
        }
        return treinos;
    }

    public List<Treino> listarTreinosPorProfessor(String idProfessor) {
        conn = ConnFactory.getConn();
        String sqlSelect = "SELECT * FROM Treino WHERE idProfessor = ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Treino> treinos = new ArrayList<>();

        try {
            stmt = conn.prepareStatement(sqlSelect);
            stmt.setString(1, idProfessor);
            rs = stmt.executeQuery();

            while (rs.next()) {
                treinos.add(new Treino(
                        rs.getString("idTreino"),
                        rs.getString("nome"),
                        rs.getString("descricao"),
                        Arrays.asList(rs.getString("especialidades").split(",")),
                        rs.getString("idProfessor"),
                        rs.getString("instrucoes")
                ));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar treinos do professor: " + e.getMessage());
        } finally {
            ConnFactory.closeConn(conn, stmt, rs);
        }
        return treinos;
    }



}
