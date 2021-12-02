package PatikaÖdevleri.Loops;

import java.util.Scanner;

public class UsluSayiHesap {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Bir Değer Giriniz...");
        int a = scan.nextInt();

        System.out.println("Lütfen Sayının Üsünü Giriniz...");
        int b = scan.nextInt();

        int carp = 1;


        /*
        int i = 0;
        while (i<b){
            carp *= a;
            i++;
        }
        System.out.println("Sonuç : "+carp);

        */

        for (int i = 0; i < b; i++) {
            carp *= a;
        }
        System.out.println("Sonuç : " + carp);

    }


}
