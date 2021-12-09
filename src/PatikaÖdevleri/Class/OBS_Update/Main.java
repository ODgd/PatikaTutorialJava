package PatikaÖdevleri.Class.OBS_Update;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Main m = new Main();
        m.showMonitor();

    }

    public void showMonitor() {
        Data d1 = new Data();
        Student s1 = new Student();
        Course c1 = new Course();

        while (true) {
            System.out.println("\n*****Ögrenci Bilgi Sistemine Hosgeldiniz*****");
            System.out.println("\n\t1.Ögretmen Girişi  ");
            System.out.println("\t2.Ögrenci Girişi");
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            switch (a) {
                case 1:
                    System.out.println("\n1.Öğrenci Bilgi ve Not Girişi  ");
                    System.out.println("2. Ders ve Öğretmen Bilgisi Görüntüleme");
                    System.out.println("Çıkış için 3'a basınız");
                    a = in.nextInt();
                    switch (a) {
                        case 1:
                            d1.setÖğrenciList(d1.getÖğrenciList());
                            break;
                        case 2:
                            c1.ogretmenAtama();
                            break;
                        case 3:
                            System.out.println("Sistemden cikis");
                            System.exit(0);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("\n1. Öğrenci Notları Görüntüleme");
                    System.out.println("2. Ders ve Öğretmen Bilgisi Görüntüleme");
                    System.out.println("Çıkış için 0'a basınız");
                    a = in.nextInt();

                    switch (a) {
                        case 1:
                            s1.ogrenciKarne();
                            break;
                        case 2:
                            c1.ogretmenAtama();
                            break;
                        case 3:
                            System.out.println("Sistemden cikis");
                            System.exit(0);
                            break;
                    }
                    break;
            }
        }
    }
}


