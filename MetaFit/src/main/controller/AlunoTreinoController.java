package main.controller;

import main.dao.AlunoTreinoDao;
import main.model.Treino;

import java.util.ArrayList;
import java.util.List;

public class AlunoTreinoController {

    private final AlunoTreinoDao alunoTreinoDao = new AlunoTreinoDao();

    public boolean cadastrarAlunoEmTreino(String idAluno, String idTreino) {
        if (idAluno != null && !idAluno.isEmpty() && idTreino != null && !idTreino.isEmpty()) {
          return   alunoTreinoDao.cadastrarAlunoEmTreino(idAluno, idTreino);
        } else {
            throw new IllegalArgumentException("ID do aluno ou do treino inválido");
        }
    }

    public void removerAlunoDoTreino(String idAluno, String idTreino) {
        if (idAluno != null && !idAluno.isEmpty() && idTreino != null && !idTreino.isEmpty()) {
            alunoTreinoDao.removerAlunoDoTreino(idAluno, idTreino);
        } else {
            throw new IllegalArgumentException("ID do aluno ou do treino inválido");
        }
    }

    public ArrayList<Treino> listarTreinosPorAluno(String idAluno) {
        if (idAluno != null && !idAluno.isEmpty()) {
            return alunoTreinoDao.listarTreinosPorAluno(idAluno);
        }
        throw new IllegalArgumentException("ID do aluno inválido");
    }
}
