package iniciante;

import java.util.Scanner;

public class Beecrowd1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idadeEmDias = sc.nextInt();

        int idadeEmAnos = idadeEmDias / 365;
        int idadeEmMeses = (idadeEmDias % 365) / 30;
        idadeEmDias = (idadeEmDias % 365) % 30;

        System.out.println(idadeEmAnos + " ano(s)");
        System.out.println(idadeEmMeses + " mes(es)");
        System.out.println(idadeEmDias + " dia(s)");

        sc.close();
    }
}
