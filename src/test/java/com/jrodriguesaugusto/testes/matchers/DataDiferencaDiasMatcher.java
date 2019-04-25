package com.jrodriguesaugusto.testes.matchers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.jrodriguesaugusto.testes.utils.DataUtils;
import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class DataDiferencaDiasMatcher extends TypeSafeMatcher<Date> {

    private Integer qtdDias;

    public DataDiferencaDiasMatcher(Integer qtdDias) {
        this.qtdDias = qtdDias;
    }

    public void describeTo(Description desc) {
        Date dataEsperada = DataUtils.obterDataComDiferencaDias(qtdDias);
        DateFormat format = new SimpleDateFormat("dd/MM/YYYY");
        desc.appendText(format.format(dataEsperada));
    }

    @Override
    protected boolean matchesSafely(Date data) {
        return DataUtils.isMesmaData(data, DataUtils.obterDataComDiferencaDias(qtdDias));
    }

}

