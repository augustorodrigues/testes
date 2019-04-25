package com.jrodriguesaugusto.testes.builders;

import java.util.Arrays;

import static com.jrodriguesaugusto.testes.builders.FilmeBuilder.umFilme;
import static com.jrodriguesaugusto.testes.builders.UsuarioBuilder.umUsuario;
import static com.jrodriguesaugusto.testes.utils.DataUtils.obterDataComDiferencaDias;

import java.lang.Double;
import java.util.Date;

import com.jrodriguesaugusto.testes.entity.Filme;
import com.jrodriguesaugusto.testes.entity.Locacao;
import com.jrodriguesaugusto.testes.entity.Usuario;
import com.jrodriguesaugusto.testes.utils.DataUtils;

public class LocacaoBuilder {
    private Locacao elemento;
    private LocacaoBuilder(){}

    public static LocacaoBuilder umLocacao() {
        LocacaoBuilder builder = new LocacaoBuilder();
        inicializarDadosPadroes(builder);
        return builder;
    }

    public static void inicializarDadosPadroes(LocacaoBuilder builder) {
        builder.elemento = new Locacao();
        Locacao elemento = builder.elemento;


        elemento.setUsuario(umUsuario().agora());
        elemento.setFilmes(Arrays.asList(umFilme().agora()));
        elemento.setDataLocacao(new Date());
        elemento.setDataRetorno(DataUtils.obterDataComDiferencaDias(1));
        elemento.setValor(4.0);
    }

    public LocacaoBuilder comUsuario(Usuario param) {
        elemento.setUsuario(param);
        return this;
    }

    public LocacaoBuilder comListaFilmes(Filme... params) {
        elemento.setFilmes(Arrays.asList(params));
        return this;
    }

    public LocacaoBuilder comDataLocacao(Date param) {
        elemento.setDataLocacao(param);
        return this;
    }

    public LocacaoBuilder comDataRetorno(Date param) {
        elemento.setDataRetorno(param);
        return this;
    }

    public LocacaoBuilder atrasada(){
        elemento.setDataLocacao(obterDataComDiferencaDias(-4));
        elemento.setDataRetorno(obterDataComDiferencaDias(-2));
        return this;
    }

    public LocacaoBuilder comValor(Double param) {
        elemento.setValor(param);
        return this;
    }

    public Locacao agora() {
        return elemento;
    }
}

