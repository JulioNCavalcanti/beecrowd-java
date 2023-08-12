package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nomeDoVendedor = sc.next();
        double salarioFixo = sc.nextDouble();
        double totalDeVendasEmDinheiro = sc.nextDouble();
        double salarioComComissao = salarioFixo + (totalDeVendasEmDinheiro * 0.15);

        System.out.println("TOTAL = R$ " + String.format("%.2f", salarioComComissao));

        sc.close();
    }
}
