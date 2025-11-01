package Exercicio2;

public class Moto extends Veiculo {
    private int cilindrada;
    private String tipoPartida;

    public Moto(String marca, String modelo, int ano, double precoDiaria, int cilindrada, String tipoPartida) {
        super(marca, modelo, ano, precoDiaria);
        this.cilindrada = cilindrada;
        this.tipoPartida = tipoPartida;
    }

    @Override
    public double calcularCustoLocacao (int dias) {
        System.out.println();
        System.out.println("| -- Locação da Moto -- |");
        System.out.println("Custo Locação = Dias * precoDiaria");
        System.out.println("Locação = " + dias + " * " + precoDiaria);
        double custoLocacao = dias * precoDiaria;
        System.out.println("Custo Locação da Moto: R$" + custoLocacao);
        System.out.println();
        return custoLocacao;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public String getTipoPartida() {
        return tipoPartida;
    }
}
