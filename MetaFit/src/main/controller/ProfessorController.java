package main.controller;

import javax.swing.JOptionPane;

import main.controller.utils.CriptografarSenha;
import main.controller.utils.Validador;
import main.dao.ProfessorDao;
import main.dao.UsuarioDao;
import main.model.Professor;

public class ProfessorController implements UsuarioController
{
    Validador validador = new Validador();
    ProfessorDao professorDao = new ProfessorDao();
    UsuarioDao usuarioDao = new UsuarioDao();

    public Professor cadastrar(Object o)
    {
        if(o instanceof Professor professor)
        {
            String senhaCriptografada = CriptografarSenha.criptografarSenha(professor.getSenha());
            String idUsuario = usuarioDao.cadastrarUsuario(professor.getNome(), professor.getEmail(),
            senhaCriptografada, professor.getTipo());
            professorDao.cadastrarProfesssor(idUsuario, professor.getEspecialidades());
           return buscar(idUsuario);
        }
        return null;
    }

    public Professor buscar(String id)
    {
        if(id != null && !id.isEmpty())
        {
            return professorDao.buscarProfessor(id);
        }
        else
        {
            throw new IllegalArgumentException("Id inválido");
        }
    }

    public Professor atualizar(Object o)
    {
        if(o instanceof Professor professor)
        {
            if(validador.validarProfessor(professor))
            {
            usuarioDao.atualizarUsuario(professor.getId(), professor.getNome(), professor.getEmail(),
            professor.getSenha(), professor.getTipo());
            professorDao.atualizarProfessor(professor.getId(),professor.getEspecialidades());

            return buscar(professor.getId());
            }
        }
        return null;
    }

    public void excluir(String id)
    {
        if(id != null && !id.isEmpty())
        {
            professorDao.excluirProfessor(id);
            usuarioDao.excluirUsuario(id);
        }
    }

    public Object fazerLogin(String email, String senha)
    {
        if(usuarioDao.fazerLogin(email, senha) != null && usuarioDao.fazerLogin(email, senha).getClass().equals(Professor.class))
        {
            return usuarioDao.fazerLogin(email,senha);
        }
        else
        {
            return null;
        }
    }
}