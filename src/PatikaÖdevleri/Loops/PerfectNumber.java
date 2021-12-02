package PatikaÖdevleri.Loops;

public class PerfectNumber {


    public static void main(String[] args) {
        //      1
        //      2 6
        //      3 7 10
        //      4 8 11 13
        //      5 9 12 14 15

        for (int i = 1; i <= 5; i++) {
            int toplam = i;
            for (int j = 1; j <= i; j++) {

                System.out.print(toplam + " ");
                toplam = toplam + 5 - j;
            }
            System.out.println();


        }





            /*1
              2 13
              3 12 14
              4 11 15 22
              5 10 16 21 23
              6 9 17 20 24 27
              7 8 18 19 25 26 28

             */
        for (int i = 1; i <= 5; i++) {
            int toplam = i;
            for (int j = 1; j <= i; j++) {


            }

        }
    }

}


