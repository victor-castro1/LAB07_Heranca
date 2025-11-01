package Exercicio2;

public class Carro extends Veiculo {
    private int numeroPortas;
    private String tipoCombustivel;

    public Carro(String marca, String modelo, int ano, double precoDiaria, int numeroPortas, String tipoCombustivel) {
        super(marca, modelo, ano, precoDiaria);
        this.numeroPortas = numeroPortas;
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public double calcularCustoLocacao(int dias) {
        System.out.println();
        System.out.println("| -- Locação da Carro -- |");
        System.out.println("Custo Locação = Dias * precoDiaria");
        System.out.println("Locação = " + dias + " * " + precoDiaria);
        double custoLocacao = dias * precoDiaria;
        System.out.println("Custo Locação do Carro: R$" + custoLocacao);
        System.out.println();
        return custoLocacao;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
}
