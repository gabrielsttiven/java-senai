package atividade7;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Gerente extends CargoDeConfianca implements Autenticavel {

    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao, int idade) {
        super(bonificacao, nome, cpf, rg, genero, salarioBase, dataNascimento, dataAdmissao, idade);
    }

    @Override
    public double salarioFinal() {
        return super.salarioBase * Bonificacao.GERENTE.getValor() + salarioBase;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Gerente: " + Util.formatarMonetacao(salarioFinal());
    }

   
}
