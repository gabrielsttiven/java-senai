package atividade4;
public enum Bonificacao {
    GERENTE (0.2),
    DIRETOR (0.4);
    
    final double valor;

    private Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
    
}
