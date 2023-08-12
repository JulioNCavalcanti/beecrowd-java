package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroDoFuncionario = sc.nextInt();
        int numeroDeHorasTrabalhadas = sc.nextInt();

        double valorQueRecebePorHora = sc.nextDouble();
        double salario = numeroDeHorasTrabalhadas * valorQueRecebePorHora;

        System.out.println("NUMBER = " + numeroDoFuncionario);
        System.out.println("SALARY = U$ " + String.format("%.2f", salario));

        sc.close();
    }
}
