package atividade5;
public enum UnidadeFederativa {
    BAHIA ("Bahia", "BA"),
    SAO_PAULO ("São Paulo", "SP"),
    REIO_DE_JANEIRO ("Rio de Janeiro", "RJ");
    
    private final String nome;
    private final String sigla;

    private UnidadeFederativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }


}
