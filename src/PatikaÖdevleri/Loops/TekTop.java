package PatikaÖdevleri.Loops;

import java.util.Scanner;

public class TekTop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Bir Değer Giriniz...");
        int a = scan.nextInt();

        int top = 0;

        if (a >= 0) {
            for (int i = 0; i <= a; i++) {


                if (i % 2 == 0) continue;

                top += i;
            }
            System.out.println(top);
        } else {
            System.out.println("Hata. Eksi Değer Girilemez...");
        }
    }
}
