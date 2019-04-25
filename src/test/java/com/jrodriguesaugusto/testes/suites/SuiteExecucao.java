package com.jrodriguesaugusto.testes.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.jrodriguesaugusto.testes.service.CalculadoraTest;
import com.jrodriguesaugusto.testes.service.CalculoValorLocacaoTest;
import com.jrodriguesaugusto.testes.service.LocacaoServiceTest;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        CalculadoraTest.class,
        CalculoValorLocacaoTest.class,
        LocacaoServiceTest.class
})
public class SuiteExecucao {
    //Remova se puder!
}

