package atividade4;
public enum Setor {
    ENGENHARIA ("Engenharia"),
    SAUDE ("Saúde"),
    JURIDICO ("Jurídico"),
    FINANCEIRO ("Financeiro"),
    RECURSOS_HUMANOS ("Recursos Humanos"),
    ADMINISTRATIVO ("Administrativo"),
    OPERACOES ("Operações");
    
    private final String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
}
