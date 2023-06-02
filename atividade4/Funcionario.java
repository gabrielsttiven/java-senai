package atividade4;

import java.time.LocalDate;

public abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected String rg;
    protected Genero genero;
    protected double salarioBase;
    protected Setor setor;
    protected LocalDate dataAdmissao;

    public Funcionario(String nome, String cpf, String rg, Genero genero, double salarioBase, Setor setor, LocalDate dataAdmissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.genero = genero;
        this.salarioBase = salarioBase;
        this.setor = setor;
        this.dataAdmissao = dataAdmissao;
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

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }
    


    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    
    public abstract double getSalarioFinal();

    @Override
    public String toString() {
        return "\n Nome: " + nome +
                   "\n CPF: " + cpf +
                   "\n RG: " + rg + 
                   "\n Gênero: " + genero.getTexto() +
                   "\n Salário Base: " + salarioBase +
                   "\n Setor: " + setor.getNome() +
                   "\n Data de Admissão: " + dataAdmissao;
    }
    
    
}

