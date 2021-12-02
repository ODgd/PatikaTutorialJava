package PatikaÖdevleri.Loops;

import java.util.Scanner;

public class FactorialHesap {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

      /*  System.out.println("Lütfen Faktöriyel Hesaplama İçin Bir Değer Girin...");
        int sayi = scan.nextInt();
        int a = 1;

        for (int i = 1; i <= sayi; i++){
           a *= i;
            System.out.println(i);//Sayıları da görürüz
            System.out.println("Sayınızın Faktöriyeli : " + a);//for dışında sonucu 1 kez bastırır. içinde ise her sonucu gösterir.
        }
         */

        //Kombinasyon Hesabı : C(n,r) = n! / (r! * (n-r)!)
        // Kullanıcıdan iki sayı al.

        System.out.println("Lütfen Kombinasyon Hesaplama İçin İlk Değeri Girin...");
        int sayi1 = scan.nextInt();

        System.out.println("Lütfen Faktöriyel Hesaplama İçin Son Değeri Girin...");
        int sayi2 = scan.nextInt();

        int a = 1;
        int b = 1;
        int c = 1;

        for (int i = 1; i <= sayi1;i++){
            a *= i;
        }
        for (int j = 1; j <= sayi2; j++){
            b *= j;
        }
        for (int k = 1; k <= (sayi1-sayi2);k++){
            c *= k;
        }
        int kom = a / (b*c);
        System.out.println("Girdiğiniz Değerlerin Kombinasyonu : "+kom);



    }
}
