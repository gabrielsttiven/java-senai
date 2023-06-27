
package atividade;
public enum Genero {
    MASCULINO('M', "Masculino"),
    FEMININO('F', "Feminino");
    
    private final char caratere;
    private final String texto;

    private Genero(char caratere, String texto) {
        this.caratere = caratere;
        this.texto = texto;
    }

    public char getCaratere() {
        return caratere;
    }

    public String getTexto() {
        return texto;
    }
    
    
   
}
