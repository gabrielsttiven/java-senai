
package com.mycompany.main;
public class Medico extends Funcionario{
    private String crm;

    public Medico(String crm, String nome, String cpf, String rg, Double salario) {
        super(nome, cpf, rg, salario);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n CRM: " + crm;
    }
    
    
}
