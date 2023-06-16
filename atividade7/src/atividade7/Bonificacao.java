
package atividade7;
public enum Bonificacao {
    GERENTE(0.2),
    DIRETOR(0.4);
    
    protected final double valor;

    private Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    
}
