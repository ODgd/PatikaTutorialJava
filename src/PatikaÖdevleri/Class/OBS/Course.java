package PatikaÖdevleri.Class.OBS;

public class Course {

    Teacher teacher;
    String name;
    String code;
    String prefix;
    int vize1;
    int vize2;
    int fnl;
    double cAvarage;

    Course(String name, String code, String prefix) {
        this.teacher = teacher;
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.cAvarage = 0.0;
        this.vize1 = 0;
        this.vize2 = 0;
        this.fnl = 0;
    }



    void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.teacher = t;
            System.out.println("İşlem Başarılı\n" + this.name + " dersine " + t.name + " hoca atandı");
        } else {
            System.out.println(t.name + " hoca bu dersi alamaz");
        }
    }

    public double courseAvarage() {

        if ((vize1 >= 0 && vize1 <= 100) && (vize2 >= 0 && vize2 <= 100) && (fnl >= 0 && fnl <= 100)) {
            this.cAvarage = ((vize1 * 0.3) + (vize2 * 0.3) + (fnl * 0.4));
        } else {
            System.out.println("Notlarınızı 0 ile 100 arasında giriniz");
        }
        return cAvarage;
    }
}


