package PatikaÖdevleri.Loops;

import java.util.Scanner;

public class Bolunen3ve4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Bir Sayı Giriniz...");
        int sayi = scan.nextInt();

        int top = 0;
        int tur = 0;

        for (int i = 0; i<=sayi; i++){

            if (i%3 != 0 || i%4 != 0){
                continue;
            }
            else {
                top += i;
                tur = i/12;
            }
        }
        System.out.println("Girdiğiniz Sayılardan 3 ve 4'e bölünenlerin Ortalaması : "+ top/tur);

    }
}
