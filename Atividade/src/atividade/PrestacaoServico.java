
package atividade;

import java.time.LocalDate;

public class PrestacaoServico extends Juridica {
    private LocalDate contratoInicio;
    private LocalDate contratoFim;

    public PrestacaoServico(LocalDate contratoInicio, LocalDate contratoFim, String cnpj, String inscricaoEstadual, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricaoEstadual, nome, telefone, email, endereco);
        this.contratoInicio = contratoInicio;
        this.contratoFim = contratoFim;
    }

    public LocalDate getContratoInicio() {
        return contratoInicio;
    }

    public void setContratoInicio(LocalDate contratoInicio) {
        this.contratoInicio = contratoInicio;
    }

    public LocalDate getContratoFim() {
        return contratoFim;
    }

    public void setContratoFim(LocalDate contratoFim) {
        this.contratoFim = contratoFim;
    }

    @Override
    public String toString() {
        return super.toString() +
                "---PRESTAÇÃO DE SERVIÇO---" +
                "Inicio do Contrato: " + contratoInicio +
                "Fim do Contrato: " + contratoFim;
    }
    
    
    
    
}
