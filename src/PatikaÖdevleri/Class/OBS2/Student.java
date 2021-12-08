package PatikaÖdevleri.Class.OBS2;

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
    static int a;

    public Student() {
    }

    public Student(String name, String stuNo, String classes, int mat, int tur, int geo, int bio, int tar) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.tur = tur;
        this.geo = geo;
        this.bio = bio;
        this.tar = tar;
        this.avarage = 0.0;
    }

    void dersNotları() {
        Data st = new Data();
        Scanner scan = new Scanner(System.in);
        System.out.print("\nKaçıncı öğrencinin Karnesini Görmek İstiyorsunuz : ");
        a = scan.nextInt();
        if (a < st.stuEkle().size() && a >= 0) {

            if (st.stuEkle().get(a).mat <= 100 && st.stuEkle().get(a).mat >= 0) {
                this.mat = st.stuEkle().get(a).mat;
            }
            if (st.stuEkle().get(a).tur <= 100 && st.stuEkle().get(a).tur >= 0) {
                this.tur = st.stuEkle().get(0).tur;
            }
            if (st.stuEkle().get(a).geo <= 100 && st.stuEkle().get(a).geo >= 0) {
                this.geo = st.stuEkle().get(a).geo;
            }
            if (st.stuEkle().get(a).bio <= 100 && st.stuEkle().get(a).bio >= 0) {
                this.bio = st.stuEkle().get(a).bio;
            }
            if (st.stuEkle().get(a).tar <= 100 && st.stuEkle().get(a).tar >= 0) {
                this.tar = st.stuEkle().get(a).tar;
            }
        } else {
            System.out.println("Hatalı sayı girdiniz");
        }
    }

    double ortalamaHesapla() {
        this.avarage = (this.mat + this.tur + this.geo + this.bio + this.tar) / 5;
        return this.avarage;
    }

    String isPass() {
        return ortalamaHesapla() > 55 ? "Sınıfı Geçtiniz" : "Sınıfı Geçemediniz";
    }

    void ogrenciKarne(Data st) {
        dersNotları();
        if (a < st.stuEkle().size() && a >= 0) {

            System.out.println("\n********KARNE**********");

            System.out.println("Öğrenci  adı : " + st.stuEkle().get(a).name + "\nÖğrenci numarası : " + st.stuEkle().get(a).stuNo);

            System.out.println(st.courseEkle().get(0).name + " notu : " + this.mat +
                    "\n" + st.courseEkle().get(1).name + " notu : " + this.tur + "\n" + st.courseEkle().get(2).name + " notu : " + this.geo +
                    "\n" + st.courseEkle().get(3).name + " notu : " + this.bio + "\n" + st.courseEkle().get(4).name + " notu : " + this.tar);

            System.out.println("*************************");
            System.out.println("Ortalama : " + ortalamaHesapla());
            System.out.println("Sınıf Durumu : " + isPass());
        }
    }
}
