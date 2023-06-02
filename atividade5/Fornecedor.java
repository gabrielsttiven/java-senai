package atividade5;
public class Fornecedor {
    private String produto;

    public Fornecedor(String produto) {
        this.produto = produto;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return super.toString() +
                  "Produto: " + produto;
    }
    
    
}
