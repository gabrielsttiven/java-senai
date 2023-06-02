package atividade4;

import java.time.LocalDate;

public class Gerente extends CargoDeConfianca {

    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, double salarioBase, Setor setor, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, rg, genero, salarioBase, setor, dataAdmissao);
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    @Override
    public String toString() {
        return "\n Gerente: " + 
                   super.toString() ;
    }

    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal += super.getSalarioBase() * super.bonificacao.valor;
        salarioFinal += super.getSalarioBase();
        
        return salarioFinal;
    }

    

  
    
}
