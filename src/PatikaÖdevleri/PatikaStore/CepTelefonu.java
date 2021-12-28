package PatikaÖdevleri.PatikaStore;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CepTelefonu extends Urunler {

    Musteri musteri = new Musteri();
    static int telMarkaSecim;
    static List<CepTelefonu> secilenTelefon;

    public CepTelefonu() {
    }

    public CepTelefonu(int id, double fiyat, int indirimOrani, String stokMiktari, String urunAdi, String marka,
                       String hafizaBilgisi, String ekranBoyutu, String pilGucu, String ram, String renk) {
        super(id, fiyat, indirimOrani, stokMiktari, urunAdi, marka, hafizaBilgisi, ekranBoyutu, pilGucu, ram, renk);
    }

    static String[] TelefonMarkalar = {"Samsung", "Lenovo", "Apple", "Huawei", "Casper", "Asus", "Xiaomi"};

    List<CepTelefonu> elimizdekiTelefonlar() {
        setStokMiktari();
        CepTelefonu mobile1 = new CepTelefonu(getId(), 5000, 10, getStokMiktari(), "Mi Note 10", "Xiaomi", "64 gb", "6.1", "4000", " 4 gb", "Mavi");
        CepTelefonu mobile2 = new CepTelefonu(getId(), 3000, 20, getStokMiktari(), "Galaxy Note 10", "Samsung", "128 gb", "6.5", "5000", " 6 gb", "Siyah");
        CepTelefonu mobile3 = new CepTelefonu(getId(), 7000, 5, getStokMiktari(), "Iphone 12", "Apple", "256 gb", "6.1", "5000", " 4 gb", "Gri");
        CepTelefonu mobile4 = new CepTelefonu(getId(), 6000, 15, getStokMiktari(), "P40 Pro", "Huawei", "512 gb", "6.3", "5000", " 6 gb", "Kirmizi");
        CepTelefonu mobile5 = new CepTelefonu(getId(), 2000, 5, getStokMiktari(), "ZenPhone", "Asus", "64 gb", "6.1", "5000", " 3 gb", "Gri");
        CepTelefonu mobile6 = new CepTelefonu(getId(), 1000, 5, getStokMiktari(), "T12", "Casper", "32 gb", "5.1", "3000", " 2 gb", "Gri");

        return Arrays.asList(mobile1, mobile2, mobile3, mobile4, mobile5, mobile6);
    }

    void kullaniciTelefonSecim(String[] arr, int secim) {
        secilenTelefon = elimizdekiTelefonlar().stream().filter(t -> t.getMarka().equalsIgnoreCase(arr[secim - 1])).collect(Collectors.toList());
    }

    void telefonMarkaDondur() {
        System.out.println("Listeden marka seciniz");
        for (int i = 0; i < TelefonMarkalar.length; i++) {
            System.out.println((i + 1) + ". " + TelefonMarkalar[i]);
        }
        Scanner scan = new Scanner(System.in);
        telMarkaSecim = scan.nextInt();
        if (telMarkaSecim >= 1 && telMarkaSecim <= 7) {
            kullaniciTelefonSecim(TelefonMarkalar, telMarkaSecim);
            telefonIslemleri();
        } else telefonMarkaDondur();
    }

    void telefonIslemleri() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.Urun Ozellikleri\n2.Urun Fiyat Bilgileri\n3.Satin Alma Islemleri\n4.Ana menu");
        int telIslemSecimi = scan.nextInt();
        switch (telIslemSecimi) {
            case 1 -> {
                System.out.println("*************************************");
                System.out.println("Marka : " + secilenTelefon.get(0).getMarka()
                        + "\nModel : " + secilenTelefon.get(0).getUrunAdi());
                System.out.println("*************************************");
                telefonIslemleri();
            }
            case 2 -> {
                System.out.println("*************************************");
                System.out.println("Fiyat : " + secilenTelefon.get(0).getFiyat() + " TL"
                        + "\nIndirim Orani : %" + secilenTelefon.get(0).getIndirimOrani()
                        + "\nIndirimli Fiyat : " + (secilenTelefon.get(0).getFiyat() - (((double) secilenTelefon.get(0).getIndirimOrani() / 100)
                        * secilenTelefon.get(0).getFiyat())) + " TL"
                        + "\nStok Durumu : " + secilenTelefon.get(0).getStokMiktari());
                System.out.println("*************************************");
                telefonIslemleri();
            }
            case 3 -> {
                System.out.println("*************************************");
                if (secilenTelefon.get(0).getStokMiktari().equalsIgnoreCase("Stokta mevcut")) {
                    musteri.musteriBilgileri();
                    System.out.println("*************************************");
                    satinAlma();
                    System.exit(0);
                } else {
                    System.out.println("*************************************");
                    System.out.println("Urun stokta olmadigindan satin alma islemi gerceklestirilemiyor...");
                    telefonIslemleri();
                }
            }
            case 4 -> {
                System.out.println("*************************************");
                System.out.println("Ana menuye yonlendiriliyorsunuz...");
                Runner.ekran();
            }
        }
    }

    void satinAlma() {
        System.out.println("Sepete eklediginiz urunu satin almak icin 1'e islemi iptal etmek icin 0'a basiniz");
        Scanner scan = new Scanner(System.in);
        int islemSecimi = scan.nextInt();
        switch (islemSecimi) {
            case 1 -> System.out.println("Satin alma islemi basariyla gerceklesti. Iyi gunlerde kullanin\n*********Fatura Bilgileriniz*********" +
                    "\n-------------------------------"
                    + "\nMusteri Bilgiler : \n" + musteri.musteriListe.toString() +
                    "\n-------------------------------"
                    + "\nUrun Bilgileri : \n" + secilenTelefon.toString()+
                    "\n\n----------SURPRIZZZZ----------" +
                    "\nSirketimiz yaptiginiz alisveristen dolayi size kucuk bir hediye vermek istiyor. Hediyeniz : "+ hediyeUrun());
            case 0 -> {
                System.out.println("Ana menuye yonlendiriliyorsunuz...");
                Runner.ekran();
            }
            default -> {
                System.out.println("Lutfen gecerli sayi girin");
                satinAlma();
            }
        }
    }
}


