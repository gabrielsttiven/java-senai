package com.mycompany.main;
public abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected String rg;
    protected Double salario;

    public Funcionario(String nome, String cpf, String rg, Double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\n Nome: " + nome +
                "\n CPF: " + cpf +
                "\n RG: " + rg +
                "\n Salário: " + salario;
    }
    
    
    
}
