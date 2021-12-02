package PatikaÖdevleri.Conditions;

import java.util.Scanner;

public class FlyTickets {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double i = 0.10;

        System.out.print("Lütfen Gideceğiniz Mesafeyi Giriniz : ");
        int road = scan.nextInt();

        double defTicked = i*road;

        System.out.print("\nLütfen Yaşınızı Giriniz : ");
        int age = scan.nextInt();


        if (road<0 || age<0) {
            System.out.println("Uyarı ! \nHatalı Giriş. Eksi Değer Girilemez...");
        }
        else {
            System.out.println("\nBiletiniz tek yön mü yoksa gidiş-dönüş mü olacak?\n\n" +
                "1. Tek Yön\n" +
                "2. Gidiş-Dönüş ");
            int yon = scan.nextInt();

            switch (yon) {
                case 1:
                    if (0 < age && age < 12) {
                        System.out.println("İndirimsiz Bilet Fiyatınız : "+defTicked+" TL'dir");
                        System.out.println("12 Yaş Altı İndirim Tutarınız : " + defTicked * 0.5 + " TL'dir");
                        double tutar1 = defTicked - (defTicked * 0.5);
                        System.out.println("Ödemeniz Gereken Tutar : " + tutar1 + " TL'dir");
                    } else if (12 <= age && age <= 24) {
                        System.out.println("İndirimsiz Bilet Fiyatınız : "+defTicked+" TL'dir");
                        System.out.println("Genç İndirim Tutarınız : " + defTicked * 0.1 + " TL'dir");
                        double tutar2 = defTicked - (defTicked * 0.1);
                        System.out.println("Ödemeniz Gereken Tutar : " + tutar2 + " TL'dir");
                    } else if (age >= 65) {
                        System.out.println("İndirimsiz Bilet Fiyatınız : "+defTicked+" TL'dir");
                        System.out.println("65 Yaş Üstü İndirim Tutarınız : " + defTicked * 0.3 + " TL'dir");
                        double tutar3 = defTicked - (defTicked * 0.3);
                        System.out.println("Ödemeniz Gereken Tutar : " + tutar3 + " TL'dir");
                    } else {
                        System.out.println("Ödemeniz Gereken Tutar : " + defTicked + " TL'dir");
                    }
                    break;

                case 2:
                    if (0 < age && age < 12) {
                        System.out.println("İndirimsiz Bilet Fiyatınız : "+defTicked+" TL'dir");
                        System.out.println("12 Yaş Altı İndirim Tutarınız : " + defTicked * 0.5 + " TL'dir");
                        double tutar4 = defTicked - (defTicked * 0.5);
                        System.out.println("Gidiş-dönüş İndirim Tutarınız : " + (tutar4 * 0.2) + " TL'dir");
                        tutar4 -= (tutar4 * 0.2);
                        System.out.println("Ödemeniz Gereken Tutar : " + tutar4 + " TL'dir");
                    } else if (12 <= age && age <= 24) {
                        System.out.println("İndirimsiz Bilet Fiyatınız : "+defTicked+" TL'dir");
                        System.out.println("Genç İndirim Tutarınız : " + defTicked * 0.1 + " TL'dir");
                        double tutar5 = defTicked - (defTicked * 0.1);
                        System.out.println("Gidiş-dönüş İndirim Tutarınız : " + (tutar5 * 0.2) + " TL'dir");
                        tutar5 -= (tutar5 * 0.2);
                        System.out.println("Ödemeniz Gereken Tutar : " + tutar5 + " TL'dir");
                    } else if (age >= 65) {
                        System.out.println("İndirimsiz Bilet Fiyatınız : "+defTicked+" TL'dir");
                        System.out.println("65 Yaş Üstü İndirim Tutarınız : " + defTicked * 0.3 + " TL'dir");
                        double tutar6 = defTicked - (defTicked * 0.3);
                        System.out.println("Gidiş-dönüş İndirim Tutarınız : " + (tutar6 * 0.2) + " TL'dir");
                        tutar6 -= (tutar6 * 0.2);
                        System.out.println("Ödemeniz Gereken Tutar : " + tutar6 + " TL'dir");
                    } else {
                        System.out.println("Ödemeniz Gereken Tutar : " + defTicked + " TL'dir");
                    }
                    break;
            }
        }




    }
}
