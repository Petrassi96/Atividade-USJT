package main.controller.utils;

import main.model.Aluno;
import main.model.Professor;
import main.model.Treino;

import javax.swing.*;

public class Validador {

    public boolean validarProfessor(Professor professor) {

        StringBuilder erros = new StringBuilder();

        // Validar nome
        if (professor.getNome() == null || professor.getNome().trim().isEmpty()) {
            erros.append("Nome incorreto!\n");
        }

        // Validar email
        if (professor.getEmail() == null || professor.getEmail().trim().isEmpty()) {
            erros.append("Email incorreto!\n");
        } else {
            String email = professor.getEmail().toLowerCase();
            if (!email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
                erros.append("Email inválido! Deve conter um formato válido, como exemplo@dominio.com\n");
            }
        }

        // Validar senha
        if (professor.getSenha() == null || professor.getSenha().isEmpty()) {
            erros.append("Senha incorreta!\n");
        } else if (professor.getSenha().length() < 8) {
            erros.append("Senha muito curta! Deve ter no mínimo 8 caracteres.\n");
        }

        // Validar especialidades
        if (professor.getEspecialidades() == null || professor.getEspecialidades().isEmpty()) {
            erros.append("Especialidades incorretas! É necessário adicionar pelo menos uma especialidade.\n");
        }

        // Exibir erros, se existirem
        if (!erros.isEmpty()) {
            JOptionPane.showMessageDialog(null, erros.toString(),"Erro", JOptionPane.ERROR_MESSAGE);
            return false; // Indica que  validação falhou
        }

        return true;
    }

    public boolean validarAluno(Aluno aluno)
    {
        StringBuilder erros = new StringBuilder();

        //Validar nome
        if(aluno.getNome() == null || aluno.getNome().trim().isEmpty())
        {
            erros.append("Nome incorreto!\n");
        }

        //Validar email
        if(aluno.getEmail() == null || aluno.getEmail().trim().isEmpty())
        {
            erros.append("Email incorreto");
        }
        else
        {
            String email = aluno.getEmail().toLowerCase();
            if (!email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) 
            {
                erros.append("Email inválido! Deve conter um formato válido, como exemplo@dominio.com\n");
            }
        }

        //Validar Senha
        if(aluno.getSenha() == null || aluno.getSenha().isEmpty())
        {
            erros.append("Senha incorreta!\n");
        }
        else if(aluno.getSenha().length() < 8)
        {
            erros.append("Senha muito curta! Deve ter no mínimo 8 caracteres");
        }

        //Validar idade
        if(aluno.getIdade() < 10 || aluno.getIdade() > 130)
        {
            erros.append("Idade inválida.");
        }
        if (!erros.isEmpty()) 
        {
            JOptionPane.showMessageDialog(null, erros.toString(),"Erro", JOptionPane.ERROR_MESSAGE);
            return false; // Indica que a validação falhou
        }

        return true;
    }

    public boolean validarTreino(Treino treino) {
         StringBuilder erros = new StringBuilder();

        if (treino.getNomeTreino() == null || treino.getNomeTreino().trim().isEmpty()) {
            erros.append("Nome incorreto!\n");
        }
        if (treino.getDescricaoTreino() == null || treino.getDescricaoTreino().trim().isEmpty()) {
            erros.append("Descricao incorreta!\n");
        }
        if (treino.getEspecialidadeTreino() == null || treino.getEspecialidadeTreino().isEmpty()) {
            erros.append("Especialidade incorreta!\n");
        }
        if (treino.getDescricaoTreino() == null || treino.getDescricaoTreino().trim().isEmpty()) {
            erros.append("Descricao incorreta!\n");
        }
        if (!erros.isEmpty()) {
            JOptionPane.showMessageDialog(null, erros.toString(),"Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
            return true;
    }


}
