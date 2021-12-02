package PatikaÖdevleri.Conditions;

import java.util.Scanner;

public class DersGecme {

    public static void main(String[] args) {

        System.out.println("Lütfen Ders Adını Yazıp Notunuzu Giriniz...");

        Scanner scan = new Scanner(System.in);

        String dersAdi = scan.nextLine();
        int not = scan.nextInt();

        if ((not >= 0)&& (not <= 100)){

            if (not > 55){
                System.out.println("Başarılı. Dersi Geçtiniz...");
            }
            else{
                System.out.println("Başarısız. Dersten Kaldınız...");
            }
        }
        else {
            System.out.println("Yanlış Değerde Not Girdiniz...Lütfen 0 ile 100 arasında not giriniz.");
        }
    }
}
