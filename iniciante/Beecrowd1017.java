package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tempoGastoEmHoras = sc.nextInt();
        int velocidadeMedia = sc.nextInt();

        double litrosNecessarios = (tempoGastoEmHoras * velocidadeMedia) / 12.0;

        System.out.printf("%.3f%n", litrosNecessarios);

        sc.close();
    }
}
