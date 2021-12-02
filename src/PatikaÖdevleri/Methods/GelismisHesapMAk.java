package PatikaÖdevleri.Methods;

import java.util.Scanner;

public class GelismisHesapMAk {



    static void plus(){
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        System.out.println("Toplama İşlemini Sonuçlandırmak İçin 0'a Basınız");
        while (true){
            System.out.println(i++ + ". Sayı");
            number = scan.nextInt();
            if (number == 0){
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : "+result);
    }
    static void  minus(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++){
            System.out.println(i + ". sayı");
            number = scan.nextInt();
            if (i == 1){
                result += number;
                continue;
            }
                result -= number;
        }
        System.out.println("Sonuç : "+result);
    }

    static void times(){
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;
        System.out.println("Sonuca Ulaşmak İçin 1'e Basınız");

        while (true){
            System.out.println(i++ + ". sayı");
            number = scan.nextInt();

            if (number == 1){
                break;
            }
            if (number == 0){
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Sonuç : "+result);
    }
    static void divide(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++){
            System.out.println(i+". sayı");
            number = scan.nextInt();

            if (i != 1 && number == 0){
                System.out.println("Böleni sıfır giremezsiniz...");
                continue;
            }
            if (i == 1){
                result = number;
                continue;
            }

            result /= number;
        }
        System.out.println("Sonuç : "+ result);
    }

    static void power(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Taban Değeri Giriniz.");
        int base = scan.nextInt();
        System.out.println("Lütfen Üs Değerini Giriniz.");
        int us = scan.nextInt();
        int result = 1;

        for (int i = 0; i < us; i++){
            result *= base;
        }
        System.out.println("Sonuç : "+ result);
    }
    static void factorial(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Tamsayı Değeri Giriniz.");
        int number = scan.nextInt();
        int result = 1;

        for (int i=1; i<=number; i++){
            result *= i;
        }
        System.out.println("Sonuç : "+ result);
    }
    static void mod(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Temel Sayıyı Giriniz.");
        int base = scan.nextInt();
        System.out.println("Lütfen Mod Değerini Giriniz.");
        int mod = scan.nextInt();
        int result = base%mod;
        System.out.println("Girdiğiniz Değerlerin Modu : "+result);
    }
    static void dikdortgen() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Birinci Kenarı Giriniz.");
        int kenar1 = scan.nextInt();
        System.out.println("Lütfen İkinci Kenarı Giriniz.");
        int kenar2 = scan.nextInt();
        int cevre = 2 * (kenar1 + kenar2);
        int alan = kenar1 * kenar2;

        if (kenar1 > 0 && kenar2 > 0) {
            System.out.println("Dikdörtgenin Çevresi : " + cevre);
            System.out.println("Dikdörtgenin Alanı : " + alan);
        } else {
            System.out.println("Yanlış Değer Girdiniz. Lütfen Pozitif Değer Giriniz.");
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Aşağıdaki İşlemlerden Şeçim Yapınız");
        System.out.println("----------------------------------------------------------------------");
        String islemler = "1. Toplama İşlemi\n2.Çıkarma İşlemi\n3.Çarpma İşlemi\n4.Bölme İşlemi" + "" +
                "\n5.Üs Alma İşlemi\n6.Faktöriyel İşlemi\n7.Mod Alma İşlemi\n8.Dikdörtgen Çevre-Alan Hesabı";

        System.out.println(islemler);

        int secim = scan.nextInt();

        do {
            switch (secim) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    dikdortgen();
                    break;
                default:
                    System.out.println("Yanlış Sayı Girdiniz.");
                    break;
            }
        } while (secim != 0);


    }






}
