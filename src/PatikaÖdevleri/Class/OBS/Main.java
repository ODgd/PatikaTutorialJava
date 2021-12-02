package PatikaÖdevleri.Class.OBS;


public class Main {

    //Course Sınıfı Özellikleri :
    //Nitelikler : name,code,prefix,note,Teacher
    //Metotlar : Course() , addTeacher() , printTeacher()

    //Teacher Sınıfı Özellikleri :
    //Nitelikler : name,mpno,branch
    //Metotlar : Teacher()

    //Student Sınıfı Özellikleri :
    //Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
    //Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()

    //Ödev
    //Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini her ders için ayrı ayrı belirtin. Sözlü notların ıda ortalamaya etkileme yüzdesi ile dahil edin.
    //Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.
    //Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde hesaplanır :
    //Fizik Ortalaması : (90 * 0.20) + (60* 0.80);

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
