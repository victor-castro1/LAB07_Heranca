import Exercicio4.Circulo;
import Exercicio4.FiguraGeometrica;
import Exercicio4.Retangulo;
import Exercicio4.Triangulo;

public class Main_Exercicio4 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("|---- Sistema de Figuras Geométricas ----|");

        Circulo circulo = new Circulo(5.0);
        circulo.calcularArea();
        circulo.calcularPerimetro();

        System.out.println("\\============================================================\\");
        Retangulo retangulo = new Retangulo(4.0, 6.0);
        retangulo.calcularArea();
        retangulo.calcularPerimetro();

        System.out.println("\\============================================================\\");
        Triangulo triangulo1 = new Triangulo(6.0, 4.0, 5.0, 5.0, 6.0);
        triangulo1.calcularArea();
        triangulo1.calcularPerimetro();
    }
}
