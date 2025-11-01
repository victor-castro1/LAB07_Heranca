package Exercicio3;

public class Livro extends Produto {
    private String autor;
    private String isbn;

    public Livro(String nome, double preco, int codigoBarras, String autor, String isbn) {
        super(nome, preco, codigoBarras);
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println();
        System.out.println("|-- Livro --|");
        super.exibirDetalhes();
        System.out.println("Nome do Autor: " + autor);
        System.out.println("ISBN do Livro: " + isbn);
    }
}
