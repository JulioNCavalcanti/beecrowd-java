package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1012 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double areaDoTriangulo = (A * C) / 2;
        double areaDoCirculo = 3.14159 * Math.pow(C, 2);
        double areaDoTrapezio = ((A + B) * C) / 2;
        double areaDoQuadrado = Math.pow(B, 2);
        double areaDoRetangulo = A * B;

        System.out.println("TRIANGULO: " + String.format("%.3f", areaDoTriangulo));
        System.out.println("CIRCULO: " + String.format("%.3f", areaDoCirculo));
        System.out.println("TRAPEZIO: " + String.format("%.3f", areaDoTrapezio));
        System.out.println("QUADRADO: " + String.format("%.3f", areaDoQuadrado));
        System.out.println("RETANGULO: " + String.format("%.3f", areaDoRetangulo));

        sc.close();
    }
}
