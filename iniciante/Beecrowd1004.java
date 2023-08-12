package iniciante;

import java.util.Scanner;

public class Beecrowd1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int PROD = x * y;

        System.out.println("PROD = " + PROD);

        sc.close();
    }
}
