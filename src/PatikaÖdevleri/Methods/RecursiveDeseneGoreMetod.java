package PatikaÖdevleri.Methods;

import java.util.Scanner;

public class RecursiveDeseneGoreMetod {

    static int desen(int n){

     if (n == 5){
         return 0;
     }
     if (n == 6){
         return 1;
     }

     if (n == 0 || n<0){
         return desen(n-1) + desen(n-2);
     }

     return desen(n-1) - desen(n-2);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Değer Girin");
        int n = scan.nextInt();

        System.out.println(desen(n));
    }
}
