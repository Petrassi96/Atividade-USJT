package main.dao;

import main.controller.utils.CriptografarSenha;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;


public class UsuarioDao {

    Connection conn = ConnFactory.getConn();



    public String cadastrarUsuario(String nome, String email, String senha, int tipo) {
        conn = ConnFactory.getConn();
        String sql = "INSERT INTO usuario (idUsuario,nome,email,senha,tipo) VALUES (?,?,?,?,?)";

        PreparedStatement stmt = null;
        String id = UUID.randomUUID().toString();
        try {

            stmt = conn.prepareStatement(sql);
            stmt.setString(1, id); // gera um UUID aleatorio e ja o convete para String para fazer o insert
            stmt.setString(2, nome);
            stmt.setString(3, email);
            stmt.setString(4, senha);
            stmt.setInt(5, tipo);
            stmt.executeUpdate();

        }  catch(SQLException e)
        {   try
        {   conn.rollback();
        }
        catch(SQLException ex)
        {   System.out.println("Erro ao incluir os dados do prof" + ex.toString());
        }
        }
        finally
        {   ConnFactory.closeConn(conn, stmt);
        }
        return id;

    }

    public void atualizarUsuario(String idUsuario, String nome, String email, String senha, int tipo) {
        conn = ConnFactory.getConn();
        String sql = "UPDATE Usuario SET nome = ?, email = ?, senha = ?, tipo = ? WHERE idUsuario = ?";
        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, email);
            stmt.setString(3, senha);
            stmt.setInt(4, tipo);
            stmt.setString(5, idUsuario);
            stmt.executeUpdate();

            System.out.println("Dados do usuário atualizados com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar os dados do usuário: " + e.toString());
        } finally {
            ConnFactory.closeConn(conn, stmt);
        }
    }

    public void excluirUsuario(String idUsuario) {
        conn = ConnFactory.getConn();
        String sql = "DELETE FROM Usuario WHERE idUsuario = ?";
        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, idUsuario);
            stmt.executeUpdate();


            JOptionPane.showMessageDialog(null,"Usuário excluído com sucesso!");

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

    public Object fazerLogin(String email, String senha) {
        conn = ConnFactory.getConn();
        String sql = "SELECT * FROM Usuario WHERE email = ? and senha = ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conn.prepareStatement(sql);
           stmt.setString(1, email);
          stmt.setString(2, CriptografarSenha.criptografarSenha(senha));
            rs = stmt.executeQuery();
            if(rs.next()) {
                if (rs.getString("email").equals(email) && rs.getString("senha").equals(CriptografarSenha.criptografarSenha(senha))) {
                    if (rs.getInt("tipo") == 1) {
                       ProfessorDao profDao = new ProfessorDao();
                        return profDao.buscarProfessor((rs.getString("idUsuario")));
                    } else {
                        AlunoDao alunoDao = new AlunoDao();
                       return alunoDao.buscarAluno(rs.getString("idUsuario"));
                    }
                }else {
                    JOptionPane.showMessageDialog(null, "email ou senha invalido");

                }
            }

        }catch(SQLException ex) {
            System.out.println("Erro ao consultar os dados" + ex);
        }
        finally {
            ConnFactory.closeConn(conn, stmt);
        }
        return null;
    }



}


