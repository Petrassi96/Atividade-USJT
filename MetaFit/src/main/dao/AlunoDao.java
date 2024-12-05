package main.dao;

import java.sql.*;
import java.util.UUID;

import javax.swing.JOptionPane;

import main.model.Aluno;

public class AlunoDao
{
    Connection conn = ConnFactory.getConn();

    public void cadastrarAluno(String idUsuario, int idade, double peso, String genero, double pesoMeta) {
        conn = ConnFactory.getConn();
        String sql = "INSERT INTO Aluno(idAluno, idUsuario, idade, peso, genero, pesoMeta) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = null;

        try {

            stmt = conn.prepareStatement(sql);

            stmt.setString(1, idUsuario);
            stmt.setString(2, idUsuario);
            stmt.setInt(3, idade);
            stmt.setDouble(4, peso);
            stmt.setString(5, genero);
            stmt.setDouble(6, pesoMeta);

            // Executando a atualização no banco de dados
            stmt.executeUpdate();


        } catch (SQLIntegrityConstraintViolationException e)
        {
            JOptionPane.showMessageDialog(null, "Este email já foi cadastrado utilize um diferente");


        }  catch (SQLException e) {
            try {
                conn.rollback();
            } catch (SQLException ex) {
                System.out.println("Erro ao realizar o rollback: " + ex.toString());
            }
            System.out.println("Erro ao incluir os dados: " + e.toString());
        } finally {
            ConnFactory.closeConn(conn, stmt);
        }
    }

    public Aluno buscarAluno(String idUsuario) {
        conn = ConnFactory.getConn();
        String sql = "SELECT u.idUsuario, u.nome, u.email, u.senha, u.tipo, a.idade, a.peso, a.genero, a.pesoMeta  FROM Usuario u JOIN Aluno a ON u.idUsuario = a.idUsuario WHERE u.idUsuario = ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, idUsuario);
            rs = stmt.executeQuery();
            if (rs.next()) {
                return new Aluno(rs.getNString("idUsuario"),
                        rs.getNString("nome"),
                        rs.getNString("email"),
                        rs.getNString("senha"),
                        rs.getInt("tipo"),
                        rs.getInt("idade"),
                        rs.getNString("genero"),
                        rs.getDouble("peso"),
                        rs.getDouble("pesoMeta"));
            }else {
                JOptionPane.showMessageDialog(null,"Usuario não encontrado");
                return null;
            }

        }  catch(SQLException ex) {
            System.out.println("Erro ao consultar os dados" + ex);
        }
        finally {
            ConnFactory.closeConn(conn, stmt);
        }

        return null;

    }


    public void atualizarAluno(String idUsuario, int idade, double peso, String genero, double pesoMeta) {
        conn = ConnFactory.getConn();
        String sql = "UPDATE Aluno SET idade = ?, peso = ?, genero = ?, pesoMeta = ? WHERE idUsuario = ?";
        PreparedStatement stmt = null;

        try {

            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idade);
            stmt.setDouble(2, peso);
            stmt.setString(3, genero);
            stmt.setDouble(4, pesoMeta);
            stmt.setString(5, idUsuario);
            stmt.executeUpdate();

            System.out.println("Dados do aluno atualizados com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar os dados do aluno: " + e.toString());
        } finally {
            ConnFactory.closeConn(conn, stmt);
        }
    }

    public void excluirAluno(String idUsuario) {
        conn = ConnFactory.getConn();
        String sql = "DELETE FROM Aluno WHERE idUsuario = ?";
        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, idUsuario);
            stmt.executeUpdate();

            System.out.println("Dados do aluno excluídos com sucesso!");

        }  catch(SQLException e) {
            try {
                conn.rollback();
        }
        catch(SQLException ex) {
                System.out.println("Erro ao excluir os dados" + ex.toString());
            }
        }
        finally {
            ConnFactory.closeConn(conn, stmt);
        }
    }


}


