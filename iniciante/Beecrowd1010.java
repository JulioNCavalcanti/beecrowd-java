package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigoDaPeca1 = sc.nextInt();
        int numeroDePecas1 = sc.nextInt();
        double valorUnitarioDaPeca1 = sc.nextDouble();

        int codigoDaPeca2 = sc.nextInt();
        int numeroDePecas2 = sc.nextInt();
        double valorUnitarioDaPeca2 = sc.nextDouble();

        double valorTotal = (numeroDePecas1 * valorUnitarioDaPeca1) + (numeroDePecas2 * valorUnitarioDaPeca2);

        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", valorTotal));

        sc.close();
    }
}
