package PatikaÖdevleri.Class.OBS;

public class Student {

    Course c1;
    Course c2;
    Course c3;
    Course cAvarage;
    String name;
    String stuNo;
    String classes;
    boolean isPass;

    public Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3)  {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        isCheckPass();
    }

    public void isCheckPass(){
        if (cAvarage.courseAvarage() >= 0.0 && cAvarage.courseAvarage() <= 100.0){
            this.cAvarage = cAvarage;
        }
    }

    public void printNote() {

        System.out.println("***************************");
        System.out.println("İsim\t: " + this.name);
        System.out.println(c1.name+" Notları Ortalaması\t: " + (this.c1.cAvarage));
        System.out.println(c2.name+" Notları Ortalaması\t: " + (this.c2.cAvarage));
        System.out.println(c3.name+" Notları Ortalaması\t: " + (this.c3.cAvarage));
    }
}
