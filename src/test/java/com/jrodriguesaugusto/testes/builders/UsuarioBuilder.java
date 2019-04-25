package com.jrodriguesaugusto.testes.builders;

import com.jrodriguesaugusto.testes.entity.Usuario;

public class UsuarioBuilder {

    private Usuario usuario;

    private UsuarioBuilder() {}

    public static UsuarioBuilder umUsuario(){
        UsuarioBuilder builder = new UsuarioBuilder();
        builder.usuario = new Usuario();
        builder.usuario.setNome("Usuario 1");
        return builder;
    }

    public UsuarioBuilder comNome(String nome) {
        usuario.setNome(nome);
        return this;
    }

    public Usuario agora(){
        return usuario;
    }
}

