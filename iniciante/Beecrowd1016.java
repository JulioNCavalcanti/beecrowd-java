package iniciante;

import java.util.Scanner;

public class Beecrowd1016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int distanciaEmKm = sc.nextInt();

        int tempoNecessarioEmMinutos = distanciaEmKm * 2;

        System.out.println(tempoNecessarioEmMinutos + " minutos");

        sc.close();
    }
}
