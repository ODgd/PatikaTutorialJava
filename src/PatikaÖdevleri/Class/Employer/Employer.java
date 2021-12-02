package PatikaÖdevleri.Class.Employer;

public class Employer {

    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employer(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void tax() {
        double tax = 0.0;
        if (this.salary < 1000.0) {
            System.out.println("Vergi ödemek için yeterli gelire sahip değilsiniz");
        } else {
            tax = this.salary * (0.03);
            System.out.printf("Ödemeniz Gereken Vergi Tutarınız : "+tax+" TL'dir");
        }

    }

    int bonus(int workHours) {
        int bonus = 0;

        if (this.workHours - 40 > 0) {
            bonus = (this.workHours - 40) * 30;
        }
        return bonus;
    }

    double raiseSalary(double salary, int workHours) {
        int yearNow = 2021;
        double raise = 0.0;

        if (yearNow - this.workHours < 10 && yearNow - this.workHours > 0) {
            raise = this.salary * (0.05);
        } else if (yearNow - this.workHours >= 10 && yearNow - this.workHours < 20) {
            raise = this.salary * (0.1);
        } else {
            raise = this.salary * (0.15);
        }
        return raise;
    }

    void toPrint() {
        System.out.println("---------Çalışanın Temel Bilgileri-----------");
        System.out.println("Çalışan : " + this.name + "\nMaaşı : " + this.salary+" TL" + "\nÇalıştığı Süre : " + this.workHours+" Saat"
                + "\nİşe Başlama Yılı : " + this.hireYear);
        System.out.println("\n---------Vergi---------\nÇalışanın Ödemesi Gereken Vergi Tutarı : \n");
        tax();
        System.out.println("\n\n---------Bonus---------\nÇalışanın Almaya Hak Kazandığı Bonus Tutarı : " + bonus(this.workHours)+" TL'dir");
        System.out.println("\n----------Zam----------\nÇalışanın Bu Sene Alacağı Maaş Zammı : " + raiseSalary(this.salary, this.workHours)+"TL'dir");
    }
}
