package PatikaÖdevleri.Methods;

import java.util.Scanner;

public class RecursiveUsluSayi {

    static int uslu(int a, int b){

        if (a == 1 || b == 0){
            return 1;
        }
         if (b==1){
            return a;
        }

       return uslu(a, b-1)*uslu(a,1);

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Taban Değeri Girin");
        int a = scan.nextInt();
        System.out.println("Lütfen Üs Değeri Girin");
        int b = scan.nextInt();

        System.out.println(uslu(a,b));

    }

}
