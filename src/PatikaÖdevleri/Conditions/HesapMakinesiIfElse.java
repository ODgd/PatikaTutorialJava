package PatikaÖdevleri.Conditions;

import java.util.Scanner;

public class HesapMakinesiIfElse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Hesaplamak İstediğniz İki Sayıyı Giriniz...");

        int a = scan.nextInt();
        int b = scan.nextInt();

        String islem = "1. Toplama İşlemi\n" +
                "2. Çıkarma İşlemi\n" +
                "3. Çarpma İşlemi\n" +
                "4. Bölme İşlemi";

        System.out.println(islem);

        System.out.println("Lütfen Hesaplama Yapmak İstediğiniz İşlemi Seçiniz...");
        int secim = scan.nextInt();

        switch (secim) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;
        }
    }
}
