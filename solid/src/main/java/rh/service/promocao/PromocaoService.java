package rh.service.promocao;

import rh.ValidacaoException;
import rh.model.Cargo;
import rh.model.Funcionario;

public class PromocaoService {

    public void promover(Funcionario funcionario, boolean metaBatida) {
        if (funcionario.temCargo(Cargo.GERENTE)) {
            throw new ValidacaoException("Gerentes não podem ser promovidos!");
        }

        if (metaBatida) {
            Cargo novoCargo = funcionario.getCargo().getProximoCargo();
            funcionario.promover(novoCargo);
        } else {
            throw new ValidacaoException("O funcionário não pode ser promovido porque não bateu a meta!");
        }
    }

}
