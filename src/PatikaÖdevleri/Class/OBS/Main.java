package PatikaÖdevleri.Class.OBS;


public class Main {

    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut", "BIO");
        Teacher t2 = new Teacher("Ayşe", "MAT");
        Teacher t3 = new Teacher("Kamile", "TUR");

        Course c1 = new Course("Matematik", "MAT");
        Course c2 = new Course("Türkçe", "TUR");
        Course c3 = new Course("Biyoloji", "BIO");

        c1.addTeacher(t2);
        c1.printTeacher();

        Student s1 = new Student("Kemal", "4578", "4", c1, c2, c3);
        s1.addBulkExamNote(70, 60, 80, 90 , 80, 85);
        s1.printNote();

        Student s2 = new Student("Mehmet", "8796", "3", c1, c2, c3);
        s2.addBulkExamNote(30, 40, 60,65,80,85);
        s2.printNote();

        Student s3 = new Student("Hande", "8788", "3", c1, c2, c3);
        s3.addBulkExamNote(55, 65,80,90,50,50);
        s3.printNote();
    }
}