package PatikaÖdevleri.Conditions;

import java.util.Scanner;

public class KucuktenBuyugeSiralama {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Girdiğiniz Üç Sayı Küçükten Büyüğe Sıralanacaktır...\n");
        System.out.print("Lütfen İlk Sayınızı Giriniz : ");
        int a = scan.nextInt();

        System.out.print("Lütfen İkinci Sayınızı Giriniz : ");
        int b = scan.nextInt();

        System.out.print("Lütfen Son Sayınızı Giriniz : ");
        int c = scan.nextInt();

        String i = "Girdiğiniz Sayıların Küçükten Büyüğe Sıralaması : ";

        if ((a>b) && (a>c)){
            if (b>c){
                System.out.println(i+" a > b > c");
            }
            else {
                System.out.println(i+" a > c > b");
            }
        }
        else if ((b>a) && (b>c)){
            if (a>c){
                System.out.println(i+" b > a > c");
            }
            else {
                System.out.println(i+" b > c > a");
            }
        }
        else {
            if (a>b){
                System.out.println(i+" c > a > b");
            }
            else {
                System.out.println(i+" c > b > a");
            }
        }
    }
}
