import Exercicio1.Desenvolvedor;
import Exercicio1.Funcionario;
import Exercicio1.Gerente;

public class Main_Exercicio1 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("SISTEMA DE GERENCIAMENTO DE FUNCIONÁRIOS");
        System.out.println();

        Funcionario ManoDeyvin = new Funcionario("Deyvin", "123.456.789-00", 9000.00);

        Gerente Fiasco = new Gerente("Maria Santos", "987.654.321-00", 11000.00,
                "Tecnologia", 20);

        Desenvolvedor JovemTranquilao = new Desenvolvedor("Carlos Oliveira", "456.789.123-00",
                10000.00, "Java", 1500);

        ManoDeyvin.apresentarInformacoes();
        System.out.println();

        Thread.sleep(5000);

        Fiasco.apresentarInformacoes();
        System.out.println();

        Thread.sleep(5000);

        JovemTranquilao.apresentarInformacoes();
        System.out.println();


    }
}