package PatikaÖdevleri.Class.OBS;

public class Student {

    Course mat;
    Course tur;
    Course bio;
    double cAvarage;
    String name;
    String stuNo;
    String classes;

    Student() {
    }

    public Student(String name, String stuNo, String classes, Course mat, Course tur, Course bio) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.tur = tur;
        this.bio = bio;
    }

    void addBulkExamNote(int mat, int matS, int tur, int turS, int bio, int bioS) {

        if (mat >= 0 && mat <= 100) {
            this.mat.noteYazili = mat;
            this.mat.noteSozlu = matS;
        }
        if (tur >= 0 && tur <= 100) {
            this.tur.noteYazili = tur;
            this.tur.noteSozlu = turS;
        }
        if (bio >= 0 && bio <= 100) {
            this.bio.noteYazili = bio;
            this.bio.noteSozlu = bioS;
        }
    }

    double calcAvarage() {

        this.cAvarage = ((this.mat.noteYazili * 0.7) + (this.mat.noteSozlu * 0.3) + (this.tur.noteYazili * 0.7) + (this.tur.noteSozlu * -0.3) +
                (this.bio.noteYazili * 0.7) + (this.bio.noteSozlu * 0.3)) / 3;
        return this.cAvarage;
    }

    String isPass() {
        return calcAvarage() > 55 ? "Sınıfı Geçtiniz" : "Sınıfı Geçemediniz";
    }

    public void printNote() {

        System.out.println("***************************");
        System.out.println("İsim\t: " + this.name + "\tNumara\t: " + this.stuNo + "\tSınıf\t: " + this.classes);
        System.out.println(this.mat.name + "\tYazılı Notu\t: " + (this.mat.noteYazili) + "\tSözlü Notu : " + (this.mat.noteSozlu));
        System.out.println(this.tur.name + "\tYazılı Notu\t\t\t: " + (this.tur.noteYazili) + "\tSözlü Notu : " + (this.mat.noteSozlu));
        System.out.println(this.bio.name + "\tYazılı Notu\t\t\t: " + (this.bio.noteYazili) + "\tSözlü Notu : " + (this.mat.noteSozlu));
        System.out.println("Not ortalamanız\t\t\t\t: " + calcAvarage());
        System.out.println("***************************");
        System.out.println("Sınıf Durumu : " + isPass());
    }
}