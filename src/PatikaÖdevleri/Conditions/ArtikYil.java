package PatikaÖdevleri.Conditions;

import java.util.Scanner;

public class ArtikYil {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Artık Yıl Hesaplamak İçin Lütfen Bir Yıl Giriniz...");
        int year = scan.nextInt();
        if (year > 0) {

            if (year % 4 == 0 && year % 100 != 0) {
                System.out.println(year + " bir artık yıldır...");
            } else if (year % 400 == 0) {
                System.out.println(year + " bir artık yıldır...");
            } else {
                System.out.println(year + " bir artık yıl değildir...");
            }
        } else {
            System.out.println("Geçersiz Değer Girdiniz. \nLütfen Pozitif Bir Değer Giriniz..");
        }
    }
}
