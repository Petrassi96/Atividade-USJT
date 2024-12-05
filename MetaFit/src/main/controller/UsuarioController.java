package main.controller;

public interface UsuarioController {

    Object cadastrar(Object o);
    Object buscar(String id);
    Object atualizar(Object o);
    void excluir(String id);
    Object fazerLogin(String email, String senha);
}
