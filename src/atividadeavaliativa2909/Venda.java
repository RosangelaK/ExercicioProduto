package atividadeavaliativa2909;

public class Venda {

    private String produto;
    private float preco;
    private float quantidade;

    public Venda() {
    }

    public Venda(String produto, float preco, float quantidade) {
        this.produto = produto;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    @Override
    public String toString() {
        return "Produto{" + "produto=" + produto + ", preco=" + preco 
                + ", quantidade=" + quantidade + " subtotal " 
                + (preco * quantidade) + '}';
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

}
