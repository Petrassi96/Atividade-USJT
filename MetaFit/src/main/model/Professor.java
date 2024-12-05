package main.model;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Usuario{

    private List<String>especialidades;
    private List<Treino> treinos;

    public Professor(String id, String nome, String email, String senha, int tipo, List<String>especialidades) {
        super(id, nome, email, senha, tipo);
        this.especialidades = especialidades;
    }

    public Professor(String nome, String email, String senha, int tipo, ArrayList<String> especialidades) {
        super(nome, email, senha, tipo);
        this.especialidades = especialidades;
    }


    public List<String> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<String> especialidades) {
        this.especialidades = especialidades;
    }

    public List<Treino> getTreinos() {
        return treinos;
    }

    public void setTreinos(List<Treino> treinos) {
        this.treinos = treinos;
    }

    @Override
    public String toString() {
        return "Nome: " + super.getNome() + " Email: " + super.getEmail() + " Senha: "
                + super.getSenha() + "\n Tipo:" + super.getTipo() + " Especialidades: "+especialidades +" Treinos: "+treinos;

    }

}
