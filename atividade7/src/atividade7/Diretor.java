package atividade7;

import java.time.LocalDate;

public class Diretor extends CargoDeConfianca implements Autenticavel {

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao, int idade) {
        super(bonificacao, nome, cpf, rg, genero, salarioBase, dataNascimento, dataAdmissao, idade);
    }

    @Override
    public double salarioFinal() {
        double PREMIO = 0.1;
        return super.salarioBase * Bonificacao.DIRETOR.getValor() + (salarioBase*PREMIO) + salarioBase;
        
    }

    @Override
    public String toString() {
        return super.toString() +
                "Diretor: " + Util.formatarMonetacao(salarioFinal());
    }

}
