import Exercicio3.Eletronico;
import Exercicio3.Livro;
import Exercicio3.Produto;
import Exercicio3.Roupa;

public class Main_Exercicio3 {
    public static void main(String[] args) throws InterruptedException {

        Produto p1 = new Produto("Sapato", 77.9, 1234222222);
        System.out.println();
        System.out.println("|-- Produto --|");
        p1.exibirDetalhes();
        Thread.sleep(4500);

        Roupa r1 = new Roupa("Lacoste", 81.7, 748548548, "M", "Algodão");
        r1.exibirDetalhes();
        Thread.sleep(4500);

        Livro l1 = new Livro("Os miseráveis", 50.5, 786575215, "Victor Hugo", "3345223424");
        l1.exibirDetalhes();
        Thread.sleep(4500);

        Eletronico e1 = new Eletronico("Notebook", 2700, 71584715, "Lenovo", "30");
        e1.exibirDetalhes();


    }
}
