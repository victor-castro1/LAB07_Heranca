package Exercicio3;

public class Eletronico extends Produto{
    private String marca;
    private String voltagem;

    public Eletronico(String nome, double preco, int codigoBarras, String marca, String voltagem) {
        super(nome, preco, codigoBarras);
        this.marca = marca;
        this.voltagem = voltagem;
    }

    public String getMarca() {
        return marca;
    }

    public String getVoltagem() {
        return voltagem;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println();
        System.out.println("|-- Eletronico --|");
        super.exibirDetalhes();
        System.out.println("Marca: " + marca);
        System.out.println("Voltagem: " + voltagem);
    }
}
