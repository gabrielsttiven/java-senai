
package atividade7;

import java.time.LocalDate;

public class Motoboy extends Funcionario{
    private String placaDaMoto;

    public Motoboy(String placaDaMoto, String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao, int idade) {
        super(nome, cpf, rg, genero, salarioBase, dataNascimento, dataAdmissao, idade);
        this.placaDaMoto = placaDaMoto;
    }

    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Placa Da Moto: " + placaDaMoto;
    }

    @Override
    public double salarioFinal() {
        return salarioBase;
    }

    
    
    
}
