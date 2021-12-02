package PatikaÖdevleri.Methods;

import java.util.Scanner;

public class RecursiveAsal {

    static String asal(int n) {
        String turn = n + " Asal Sayıdır";
        String dontTurn = n + " Asal Sayı Değildir.";
        if (n == 2 || n == 3 || n == 5 || n == 7) {
            return turn;
        }
        if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 7 == 0) {
            return dontTurn;
        }

        return turn;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Girin");
        int sayi = scan.nextInt();

        System.out.println(asal(sayi));
    }
}
