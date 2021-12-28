package PatikaÖdevleri.PatikaStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Musteri {

    private String isim, tel, email, krediKarti;
    List<Musteri> musteriListe = new ArrayList<>();

    public Musteri() {
    }

    public Musteri(String isim, String tel, String email, String krediKarti) {
        this.isim = isim;
        this.tel = tel;
        this.email = email;
        this.krediKarti = krediKarti;
    }

    public String setIsim() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Isim : ");
        return scan.next();
    }

    public String setTel() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Telefon : ");
        return scan.next();
    }

    public String setEmail() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Email : ");
        return scan.next();
    }

    public String setKrediKarti() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kredi Karti No : ");
        return scan.next();
    }

    void musteriBilgileri() {
        Musteri musteri = new Musteri(setIsim(), setTel(), setEmail(), setKrediKarti());
        musteriListe.add(musteri);
    }

    @Override
    public String toString() {
        return
                "Isim\t: '" + isim + '\'' +
                        "\nTel\t: '" + tel.substring(0, 4) + tel.substring(4).replaceAll("\\w", "*") + '\'' +
                        "\nE-mail\t: '" + email.substring(0, 3) + email.substring(3, email.indexOf("@")).replaceAll("\\w", "*") + email.substring(email.indexOf("@")) + '\'' +
                        "\nKredi Karti\t: '" + krediKarti.substring(0, 4) + krediKarti.substring(4).replaceAll("\\w", "*");
    }
}
