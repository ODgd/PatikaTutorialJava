package PatikaÖdevleri.Loops;

import java.util.Scanner;

public class SayiKuvvetBulma {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Bir Sayı Giriniz...");
        int sayi = scan.nextInt();

        //2'nin kuvvetlerini yazdıran program
        // for (int i = 1; i <= sayi; i*=2){
        //System.out.println(i);}

        //4 ve 5'in kuvvetlerini yazdıran program :

        System.out.println("4'ün kuvvetleri : ");
        for (int i = 1; i <= sayi; i*=4) {
            System.out.println(i);
        }
        System.out.println("------------------------------");
        System.out.println("5'in kuvvetleri : ");
        for (int i = 1; i <= sayi; i*=5){
            System.out.println(i);
        }
    }
}
