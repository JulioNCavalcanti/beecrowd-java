/*

    Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente, uma linha em
    branco e em seguida, os valores na sequência como foram lidos.

    Entrada:
    A entrada contem três números inteiros.

    Saída:
    Imprima a saída conforme foi especificado.

 */

package iniciante;

import java.util.Arrays;
import java.util.Scanner;

public class Beecrowd1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[3];

        for (int i = 0; i < 3; i++) {
            valores[i] = sc.nextInt();
        }

        int[] valoresOrdenados = Arrays.copyOf(valores, valores.length);
        Arrays.sort(valoresOrdenados);

        for (int valor : valoresOrdenados) {
            System.out.println(valor);
        }

        System.out.println();

        for (int valor : valores) {
            System.out.println(valor);
        }

        sc.close();
    }
}
