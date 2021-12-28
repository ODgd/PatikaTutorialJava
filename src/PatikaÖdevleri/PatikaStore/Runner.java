package PatikaÖdevleri.PatikaStore;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Runner {
    static CepTelefonu cepTelefonu = new CepTelefonu();
    static Laptop laptop = new Laptop();

    public static void main(String[] args) {
        ekran();
    }

    static void ekran() {
        try {
            System.out.println("****************Patika Store Urun Yonetim Paneline Hosgeldiniz***************");
            Scanner scan = new Scanner(System.in);
            System.out.println("Listeden secim yapiniz");
            System.out.println("1.Cep telefonu\n2.Laptop\n3.Markalari gor\n4.Cikis");
            int menuSecim = scan.nextInt();
            switch (menuSecim) {
                case 1 -> {
                    cepTelefonu.telefonMarkaDondur();
                    ekran();
                }
                case 2 -> {
                    laptop.laptopMarkaDondur();
                    ekran();
                }
                case 3 -> {
                    markalariGoster();
                    ekran();
                }
                case 4 -> System.out.println("Yine bekleriz...");
                default -> {
                    System.out.println("Lutfen listeden secim yapiniz");
                    ekran();
                }
            }
        } catch (Exception e) {
            System.out.println("Yanlis deger girdiniz ! Ana menuye yonlendiriliyorsunuz...");
            ekran();
        }
    }

    static void markalariGoster() {
        Set markalariGoster = new TreeSet();
        markalariGoster.addAll(List.of(Laptop.LaptopMarkalar));
        markalariGoster.addAll(List.of(CepTelefonu.TelefonMarkalar));

        for (Object o : markalariGoster) {
            System.out.println(o);
        }
    }
}



