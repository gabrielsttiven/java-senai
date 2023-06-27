
package atividade;

import java.time.LocalDate;

public class Diretor extends Funcionario implements Contratacao{
    private final double PREMIO = 0.2;

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitir Funcionário!");
    }

    @Override
    public void demitir(Funcionario funcionario) {
      System.out.println("Demitir Funcionário!"); 
    }
    

    public Diretor(String cpf, String rg, String matricula, Setor setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, estadoCivil, dataNascimento, nome, telefone, email, endereco);
    }

    public double getPREMIO() {
        return PREMIO;
    }
    public double getSalarioFinal(){
        return salario + (salario*PREMIO);
    }

    @Override
    public String toString() {
        return super.toString() +
                "---DIRETOR--- " +
                "\nPrêmio: " + (PREMIO * 100) + "%" +
                "Salário Final: ";
    }
    
}
