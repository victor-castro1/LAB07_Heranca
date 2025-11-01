package Exercicio4;

public class Circulo extends FiguraGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        System.out.println();
        System.out.println("Figura Geométrica: Círculo");
        System.out.println("Área do círculo = π * r²");
        System.out.println("Área do círculo = " + Math.PI + " * " + raio + "²");
        double areaCirculo = Math.PI * raio * raio;
        System.out.println("Área do círculo = " + areaCirculo + "cm²");
        return areaCirculo;
    }

    @Override
    public double calcularPerimetro() {
        System.out.println("Perímetro do Círculo = 2π²");
        System.out.println("Perimetro do Triângulo = 2 * " + Math.PI + " * " + raio + "²");
        double perimetroCirculo = 2 * Math.PI * raio;
        System.out.println("Perimetro do Círculo = " + perimetroCirculo);
        System.out.println();
        return perimetroCirculo;
    }
}
