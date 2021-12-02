package PatikaÖdevleri.Loops;

import java.util.Scanner;

public class WithStarsUcgen {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Yıldızlarla Üçgen Yapmak İçin Bir Sayı Giriniz...");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int x = n - 1  ; x >= 0; x--) {

            for (int a = -1  ; a < (n - x)  ; a++) {
                System.out.print(" ");
            }

            for (int b = (2 * x - 1); b >= 1; b--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }


    }
}

