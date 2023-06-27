
package atividade;

import java.time.LocalDate;

public class Motoboy extends Funcionario{
    private String carteiraHabilitacao;

    public Motoboy(String carteiraHabilitacao, String cpf, String rg, String matricula, Setor setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, estadoCivil, dataNascimento, nome, telefone, email, endereco);
        this.carteiraHabilitacao = carteiraHabilitacao;
    }

    public String getCarteiraHabilitacao() {
        return carteiraHabilitacao;
    }

    public void setCarteiraHabilitacao(String carteiraHabilitacao) {
        this.carteiraHabilitacao = carteiraHabilitacao;
    }

    @Override
    public String toString() {
        return super.toString() +
               "" +
               "---MOTOBOY---" +
               "\nCarteira de Habilitacao: " + carteiraHabilitacao;
    }
    
    
}
