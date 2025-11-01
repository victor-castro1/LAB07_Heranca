import Exercicio2.Veiculo;
import Exercicio2.Moto;
import Exercicio2.Carro;

public class Main_Exercicio2 {
    public static void main(String[] args) throws InterruptedException {
        Moto m1 = new Moto("Honda", "CG", 2017,
                15, 100, "Câmbio");
        m1.calcularCustoLocacao(90);
        Thread.sleep(4000);

        System.out.println("||==========================================================================||");

        Carro c1 = new Carro("Chevrolet", "Camaro", 2015,
                100, 4, "Gasolina Aditivada");
        c1.calcularCustoLocacao(30);
    }
}
