package atividade4;

import java.time.LocalDate;

public class Motoboy extends Funcionario{
    private String placaDeMoto;

    public Motoboy(String placaDeMoto, String nome, String cpf, String rg, Genero genero, double salarioBase, Setor setor, LocalDate dataAdmissao) {
        super(nome, cpf, rg, genero, salarioBase, setor, dataAdmissao);
        this.placaDeMoto = placaDeMoto;
    }

    public String getPlacaDeMoto() {
        return placaDeMoto;
    }

    public void setPlacaDeMoto(String placaDeMoto) {
        this.placaDeMoto = placaDeMoto;
    }

    @Override
    public String toString() {
        return "\n Motoboy: " + super.toString() +
                  "\nPlaca de Moto: " + placaDeMoto;
    }

    @Override
    public double getSalarioFinal() {
        return super.salarioBase;
    }
   
}
