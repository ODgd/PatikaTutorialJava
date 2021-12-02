package PatikaÖdevleri.Loops;

import java.util.Scanner;

public class HarmonikSayi {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Harmonik Sayı Hesabı İçin Bir Sayı Giriniz...");
        int sayi = scan.nextInt();

        double harmonic = 0;

        for (double i = 1; i<=sayi; i++){
            harmonic += 1/i;
        }
        System.out.println("Harmonik Sayınız : "+ harmonic);
    }
}
