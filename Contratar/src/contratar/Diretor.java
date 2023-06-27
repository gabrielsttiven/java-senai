/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contratar;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Diretor extends Funcionario implements Contratacao{
    
    private double PREMIO = 0.2;

    public Diretor(String nome, LocalDate dataNascimento, Genero genero, Setor setor, double salarioBase) {
        super(nome, dataNascimento, genero, setor, salarioBase);
    }

    public double getPREMIO(){
        return PREMIO;
    }

    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal += super.salarioBase * this.PREMIO;
        salarioFinal += super.salarioBase;
        return salarioFinal;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Você está admitido!");
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Você está demitido!");
    }

    @Override
    public String toString(){
        return super.toString() + 
            "Diretor: " + "\n Prêmio: " + PREMIO +
            "\n Salário Final: " + Util.formatarMonetacao(getSalarioFinal());
    }
    
    
    

   

    
}
