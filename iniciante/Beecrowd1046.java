package iniciante;

import java.util.Scanner;

public class Beecrowd1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int hora = 0;

        if (horaInicial < horaFinal) {
            hora = horaFinal - horaInicial;
        } else if (horaInicial > horaFinal) {
            hora = (24 - horaInicial) + horaFinal;
        } else {
            hora = 24;
        }

        System.out.println("O JOGO DUROU " + hora + " HORA(S)");

        sc.close();
    }
}
