package PatikaÖdevleri.Class.OBS;


public class Main {
    
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "101", "MAT");
        Course turkce = new Course("Türkçe", "102", "TUR");
        Course bio = new Course("Biyoloji", "101", "BIO");

        Teacher t1 = new Teacher("Mahmut", "458799865", "BIO");
        Teacher t2 = new Teacher("Ayşe", "458798566", "MAT");
        Teacher t3 = new Teacher("Kamile", "9878456598789865", "TUR");

        mat.addTeacher(t2);
        turkce.addTeacher(t3);
        bio.addTeacher(t1);

       /* Student s1 = new Student("Kemal", "4578", "4", mat, turkce, bio);
        s1.c1.courseAvarage();
        s1.isPass();

        Student s2 = new Student("Mehmet", "8796", "3", mat, turkce, bio);
        s2.addBulkExamNote(72, 66, 75);
        s2.isPass();

        Student s3 = new Student("Hande", "8788", "3", mat, turkce, bio);
        s3.addBulkExamNote(68, 92, 40);
        s3.isPass();

        */


    }


}
