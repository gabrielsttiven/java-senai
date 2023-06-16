
package atividade7;
public enum Genero {
    MASCULINO("Masculino"),
    FEMININO("Feminino");
    
    private final String texto;

    private Genero(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
    
    
}
