package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1014 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        double Y = sc.nextDouble();
        double consumoMedio = X / Y;

        System.out.println(String.format("%.3f", consumoMedio) + " km/l");

        sc.close();
    }
}
