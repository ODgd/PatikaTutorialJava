package PatikaÖdevleri.Loops;

import java.util.Scanner;

public class CiftBulma {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Bir Sayı Giriniz..");
        int sayi = scan.nextInt();

        int i = 0;
        while (i<=sayi){
           if (i%2 == 0) {
               System.out.println(i);
           }
            i++;
        }
    }
}
