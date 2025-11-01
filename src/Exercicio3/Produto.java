package Exercicio3;

public class Produto {
    protected String nome;
    protected double preco;
    protected int codigoBarras;

    public Produto(String nome, double preco, int codigoBarras) {
        this.nome = nome;
        this.preco = preco;
        this.codigoBarras = codigoBarras;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("codigoBarras: " + codigoBarras);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getCodigoBarras() {
        return codigoBarras;
    }
}
