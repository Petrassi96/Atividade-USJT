package main.model;


import java.util.List;

public class Treino {

    private String idTreino;
    private String nomeTreino;
    private String descricaoTreino;
    private List<String> especialidadeTreino;
    private String idProfessor;
    private String instucoes;


    public Treino(String idTreino, String nomeTreino, String descricaoTreino, List<String> especialidadeTreino, String professor, String instucoes) {
       this.idTreino = idTreino;
        this.nomeTreino = nomeTreino;
        this.descricaoTreino = descricaoTreino;
        this.especialidadeTreino = especialidadeTreino;
        this.idProfessor = professor;
        this.instucoes = instucoes;
    }

    public Treino(String nomeTreino, String descricaoTreino, List<String> especialidadeTreino, String professor, String instucoes) {
        this.nomeTreino = nomeTreino;
        this.descricaoTreino = descricaoTreino;
        this.especialidadeTreino = especialidadeTreino;
        this.idProfessor = professor;
        this.instucoes = instucoes;
    }

    public Treino() {}

    public String getId() {
        return idTreino;
    }

    public void setId(String idTreino) {
        this.idTreino = idTreino;
    }

    public String getNomeTreino() {
        return nomeTreino;
    }

    public void setNomeTreino(String nomeTreino) {
        this.nomeTreino = nomeTreino;
    }

    public String getDescricaoTreino() {
        return descricaoTreino;
    }

    public void setDescricaoTreino(String descricaoTreino) {
        this.descricaoTreino = descricaoTreino;
    }

    public List<String> getEspecialidadeTreino() {
        return especialidadeTreino;
    }

    public void setEspecialidadeTreino(List<String> especialidadeTreino) {
        this.especialidadeTreino = especialidadeTreino;
    }

    public String getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(String idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getInstucoes() {
        return instucoes;
    }

    public void setInstucoes(String instucoes) {
        this.instucoes = instucoes;
    }

    public String toString(){
        return "Id:"+idTreino+"nome" + nomeTreino + "descricao" + descricaoTreino + "especialidade" + especialidadeTreino + "professor" + idProfessor + "instrucoes" + instucoes;
    }

}
