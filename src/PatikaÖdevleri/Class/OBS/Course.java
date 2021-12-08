package PatikaÖdevleri.Class.OBS;

public class Course {

    Teacher teacher;
    String name;
    String prefix;
    int noteYazili;
    int noteSozlu;

    Course() {
    }

    Course(String name, String prefix) {
        this.name = name;
        this.prefix = prefix;
        this.noteYazili = 0;
        this.noteSozlu = 0;
    }

    void addTeacher(Teacher t) {

        if (this.prefix.equals(t.getBranch())) {
            this.teacher = t;
            System.out.println("\nAtama İşlemi Başarılı");
        } else {
            System.out.println("\nAtama İşlemi Başarısız");
        }
    }

    void printTeacher() {

        if (this.teacher != null) {
            System.out.println(this.name + " dersine " + this.teacher.getName() + " hoca atandı");
        } else {
            System.out.println(this.name + " dersine hoca atanmadı");
        }
    }
}