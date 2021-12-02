package PatikaÖdevleri.Conditions;

import java.util.Scanner;

public class KullaniciGirisi {

    public static void main(String[] args) {
        String userName, password;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Kullanıcı Adınızı Giriniz...");
        userName = scan.nextLine();
        System.out.println("Lütfen Şifrenizi Giriniz...");
        password = scan.nextLine();

        if (userName.equals("LostCode") && password.equals("1869")){
            System.out.println("Giriş Başarılı...\n***Hoşgeldiniz***");
        }
        else {
            System.out.println("Giriş Başarısız...");
            System.out.println("Şifrenizi Sıfırlamak İstiyorsanız 'Evet' Yazın, Çıkış için q'ya basınız...");

            String sifirla = scan.nextLine();
            if (sifirla.equals("Evet")) {

                System.out.println("Yeni Şifrenizi Giriniz");
                String newPass = scan.nextLine();

                if (newPass.equals("1869")) {
                    System.out.println("Şifre Oluşturulamadı. Lütfen Başka Bir Şifre Giriniz.");
                } else {
                    System.out.println("Yeni Şifreniz Başarıyla Oluşturuldu.");
                }
            }
            else if (sifirla.equals("q")){
                System.out.println("Çıkış Yapılıyor...");
            }
            else {
                System.out.println("İşlem Yapmadınız...");
            }
        }
    }

    }

