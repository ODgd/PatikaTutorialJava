package PatikaÖdevleri.Class.OBS2;

import java.util.ArrayList;
import java.util.List;

public class Data {

    List<Student> stuEkle() { // Öğrencilerin listesi
        //  Data s = new Data();
        List<Student> öğrenciList = new ArrayList<>();

        Student s1 = new Student("Ali", "123", "3", 70, 60,50,40,80);
        Student s2 = new Student("Ayşe", "321", "4",85,18,35,45,70);
        Student s3 = new Student("Mehmet", "456", "2",85,90,75,80,60);
        Student s4 = new Student("Ece", "654", "1",55,65,60,45,55);
        Student s5 = new Student("Cemşit", "789", "4", 75,65,30,45,80);

        öğrenciList.add(s1);
        öğrenciList.add(s2);
        öğrenciList.add(s3);
        öğrenciList.add(s4);
        öğrenciList.add(s5);

        return öğrenciList;
    }

    <List> java.util.List<Teacher> teacEkle() {  //Öğretmen listesi
        //  Data t = new Data();
        java.util.List<Teacher> öğretmenList = new ArrayList<>();

        Teacher t1 = new Teacher("Mahmut", "MAT");
        Teacher t2 = new Teacher("Seda", "TUR");
        Teacher t3 = new Teacher("Canan", "GEO");
        Teacher t4 = new Teacher("Ramazan", "BİO");
        Teacher t5 = new Teacher("Şeyma", "TAR");

        öğretmenList.add(t1);
        öğretmenList.add(t2);
        öğretmenList.add(t3);
        öğretmenList.add(t4);
        öğretmenList.add(t5);

        return öğretmenList;

    }

    List<Course> courseEkle() { // Derslerin listesi
        //    Data c = new Data();
        List<Course> dersList = new ArrayList<>();

        Course c1 = new Course("Matematik", "MAT");
        Course c2 = new Course("Türkçe", "TUR");
        Course c3 = new Course("Geometri", "GEO");
        Course c4 = new Course("Biyoloji", "BİO");
        Course c5 = new Course("Tarih", "TAR");

        dersList.add(c1);
        dersList.add(c2);
        dersList.add(c3);
        dersList.add(c4);
        dersList.add(c5);

        return dersList;
    }

}
