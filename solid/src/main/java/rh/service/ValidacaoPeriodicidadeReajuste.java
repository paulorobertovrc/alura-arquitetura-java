package rh.service;

import rh.ValidacaoException;
import rh.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ValidacaoPeriodicidadeReajuste implements ValidacaoReajuste {

    public void validar(Funcionario funcionario, BigDecimal aumento) {
        LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();
        long mesesDesdeUltimoReajuste = dataUltimoReajuste.until(dataAtual).toTotalMonths();

        if (mesesDesdeUltimoReajuste < 6) {
            throw new ValidacaoException("Intervalo entre reajustes deve ser de no mínimo 6 meses!");
        }
    }

}
