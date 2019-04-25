package com.jrodriguesaugusto.testes.dao;

import java.util.List;

import com.jrodriguesaugusto.testes.entity.Locacao;

public interface LocacaoDAO {

    public void salvar(Locacao locacao);

    public List<Locacao> obterLocacoesPendentes();
}
