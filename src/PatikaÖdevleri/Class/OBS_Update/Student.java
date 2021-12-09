package PatikaÖdevleri.Class.OBS_Update;

import java.util.Scanner;

public class Student {

    String name;
    String stuNo;
    String classes;
    int mat;
    int tur;
    int geo;
    int bio;
    int tar;
    double avarage;

    public Student() {
    }

    public Student(String name, String stuNo, int mat, int tur, int geo, int bio, int tar) {
        this.name = name;
        this.stuNo = stuNo;
        this.mat = mat;
        this.tur = tur;
        this.geo = geo;
        this.bio = bio;
        this.tar = tar;
    }

    void dersNotları() {
        Data st = new Data();

        for (int i = 0; i < st.getÖğrenciList().size(); i++) {

            if (st.getÖğrenciList().get(i).mat <= 100 && st.getÖğrenciList().get(i).mat >= 0) {
                this.mat = st.getÖğrenciList().get(i).mat;
            }
            if (st.getÖğrenciList().get(i).tur <= 100 && st.getÖğrenciList().get(i).tur >= 0) {
                this.tur = st.getÖğrenciList().get(0).tur;
            }
            if (st.getÖğrenciList().get(i).geo <= 100 && st.getÖğrenciList().get(i).geo >= 0) {
                this.geo = st.getÖğrenciList().get(i).geo;
            }
            if (st.getÖğrenciList().get(i).bio <= 100 && st.getÖğrenciList().get(i).bio >= 0) {
                this.bio = st.getÖğrenciList().get(i).bio;
            }
            if (st.getÖğrenciList().get(i).tar <= 100 && st.getÖğrenciList().get(i).tar >= 0) {
                this.tar = st.getÖğrenciList().get(i).tar;
            }
        }
    }

    double ortalamaHesapla() {
        this.avarage = (this.mat + this.tur + this.geo + this.bio + this.tar) / 5;
        return this.avarage;
    }

    String isPass() {
        return ortalamaHesapla() > 55 ? "Sınıfı Geçtiniz" : "Sınıfı Geçemediniz";
    }

    public void ogrenciKarne() {

        Data st = new Data();
        Student s = new Student();
        dersNotları();
        Scanner scan = new Scanner(System.in);
        System.out.print("Karnesini görmek istediğiniz öğrencinin adını yazınız : ");
        String isim = scan.nextLine();

        if (st.getÖğrenciList().size() != 0) {

            for (int i = 0; i < st.getÖğrenciList().size(); i++) {

                if (st.getÖğrenciList().get(i).name.equalsIgnoreCase(isim)) {

                    System.out.println("\n********KARNE**********");

                    System.out.println("Öğrenci  adı : " + st.getÖğrenciList().get(i).name + "\nÖğrenci numarası : " + st.getÖğrenciList().get(i).stuNo);
                    System.out.println();
                    System.out.println(st.courseEkle().get(0).name + " notu : " + this.mat +
                            "\n" + st.courseEkle().get(1).name + " notu : " + this.tur + "\n" + st.courseEkle().get(2).name + " notu : " + this.geo +
                            "\n" + st.courseEkle().get(3).name + " notu : " + this.bio + "\n" + st.courseEkle().get(4).name + " notu : " + this.tar);

                    System.out.println("*************************");
                    System.out.println("Ortalama : " + ortalamaHesapla());
                    System.out.println("Sınıf Durumu : " + isPass());

                } else {
                    System.out.println("*****Sistemde girdiğiniz isimde bir öğrenci bulunmamaktaır");
                }
            }
        } else System.out.println("*****Sistemde kayıtlı öğrenci bulunmamaktadır");
    }
}

