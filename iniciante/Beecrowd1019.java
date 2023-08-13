package iniciante;

import java.util.Scanner;

public class Beecrowd1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int hora = N / 3600;
        int minutos = (N % 3600) / 60;
        int segundos = (N % 3600) % 60;

        System.out.println(hora + ":" + minutos + ":" + segundos);

        sc.close();
    }
}
