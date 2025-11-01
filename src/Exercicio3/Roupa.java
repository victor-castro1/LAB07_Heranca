package Exercicio3;

public class Roupa extends Produto {
    private String tamanho;
    private String material;

    public Roupa(String nome, double preco, int codigoBarras, String tamanho, String material) {
        super(nome, preco, codigoBarras);
        this.tamanho = tamanho;
        this.material = material;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println();
        System.out.println("|-- Roupa --|");
        super.exibirDetalhes();
        System.out.println("Tamanho da camisa: " + tamanho);
        System.out.println("Material da camisa: " + material);
    }
}
