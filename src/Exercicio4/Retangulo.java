package Exercicio4;

public class Retangulo extends FiguraGeometrica{
    private double largura;
    private double comprimento;

    public Retangulo(double largura, double comprimento) {
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public double calcularArea() {
        System.out.println();
        System.out.println("Figura Geométrica: Retângulo");
        System.out.println("Área do retângulo = comprimento * largura");
        System.out.println("Área do retângulo = " + comprimento + " * " + largura);
        double areaRetangulo = comprimento * largura;
        System.out.println("Área do retÂngulo = " + areaRetangulo);
        return areaRetangulo;
    }

    @Override
    public double calcularPerimetro() {
        System.out.println("Perímetro do retângulo = (2 * largura) + (2 * comprimento)");
        System.out.println("Perímetro do retângulo = (" + 2 + " * " + largura + ") + (" + 2 + " * " + comprimento + ")");
        double perimetroRetangulo = 2 * (largura + comprimento);
        System.out.println("Perímetro do retângulo = " + perimetroRetangulo);
        System.out.println();
        return perimetroRetangulo;
    }
}
