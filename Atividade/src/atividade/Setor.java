
package atividade;
public enum Setor {
    TECNOLOGIA("Tecnologia"),
    MATERIAL_DE_CONTRUCAO("Material de Construção"),
    MATERIA_PRIMA("Matéria Prima"),
    ALIMENTICIO("Alimentício"),
    ENGENHARIA("Engenharia"),
    SAUDE("Saúde"),
    RECURSOS_HUMANOS("Recursos Humanos"),
    MARKETING("Marketing"),
    OPERACOES("Operações");
    
    
    private final String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
   
    
    
}
