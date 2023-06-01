package com.mycompany.main;
public class Motoboy extends Funcionario {
    private String cnh;

    public Motoboy(String cnh, String nome, String cpf, String rg, Double salario) {
        super(nome, cpf, rg, salario);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n CNH: " + cnh;
    }
    
    
}
