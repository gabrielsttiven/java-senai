package atividade4;

import java.time.LocalDate;

public class Diretor extends CargoDeConfianca {
    private final double PREMIO = 0.1;

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, double salarioBase, Setor setor, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, rg, genero, salarioBase, setor, dataAdmissao);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public String toString() {
        return "\n Diretor: " + super.toString() +
                   "\nPrêmio: " + PREMIO;
    }

    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal += super.salarioBase * super.bonificacao.valor;
        salarioFinal += super.salarioBase * PREMIO;
        salarioFinal += super.salarioBase;
        
        return salarioFinal;
    }

   

    
    
}
