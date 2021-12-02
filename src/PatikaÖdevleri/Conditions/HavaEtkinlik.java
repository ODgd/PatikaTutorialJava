package PatikaÖdevleri.Conditions;

import java.util.Scanner;

public class HavaEtkinlik {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Hava Sıcaklığını Giriniz...");
        int derece = scan.nextInt();

        if (derece<5){
            System.out.println("Bugün hava çok soğuk. Ancak kayak yapmak güzel bir tercih olabilir.");
        }
        else if (5 <= derece && 25 > derece){
            if (10<=derece && 15>derece){
                System.out.println("Bugün hava biraz serin. Sinema gibi kapalı alan etkinliği uygun olabilir.");
            }
            else if (20<=derece && 25>derece){
                System.out.println("Bugün tam bir bahar havası var. Piknik yapmaya ne dersin?");
            }
            else {
                System.out.println("Bugün gerçekten güzel bir hava var. İstersen gez toz, piknik yap istersen kız arkadaşınla sinemaya, kafeye git :)");
            }
        }
        else {
            System.out.println("Bugun hava inanılmaz sıcak. Yüzmeye gitmek serinlemene yardımcı olacaktır.");
        }
    }
}
