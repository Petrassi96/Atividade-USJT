package main.controller;

import java.util.ArrayList;
import java.util.List;

import main.controller.utils.Validador;
import main.dao.TreinoDao;
import main.model.Treino;

public class TreinoController {

    private final TreinoDao treinoDao = new TreinoDao();
    private final Validador validador = new Validador();

    public Treino cadastrar(Treino treino) {
        if (validador.validarTreino(treino)) {
           return treinoDao.cadastrarTreino(treino);
        } else {
            throw new IllegalArgumentException("Dados do treino inválidos");
        }
    }

    public Treino buscar(String idTreino) {
        if (idTreino != null && !idTreino.isEmpty()) {
            return treinoDao.buscarTreino(idTreino);
        }
        throw new IllegalArgumentException("ID do treino inválido");
    }

    public void atualizar(Treino treino) {
        if (validador.validarTreino(treino)) {
            treinoDao.atualizarTreino(treino);
        } else {
            throw new IllegalArgumentException("Dados do treino inválidos");
        }
    }

    public void excluir(String idTreino) {
        if (idTreino != null && !idTreino.isEmpty()) {
            treinoDao.excluirTreino(idTreino);
        } else {
            throw new IllegalArgumentException("ID do treino inválido");
        }
    }

    public List<Treino> listarPorProfessor(String idProfessor) {
        if (idProfessor != null && !idProfessor.isEmpty()) {
            return treinoDao.listarTreinosPorProfessor(idProfessor);
        }
        throw new IllegalArgumentException("ID do professor inválido");
    }

    public ArrayList<Treino> listarTodos() {
            return treinoDao.listarTreinos();
    }


}
