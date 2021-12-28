package PatikaÖdevleri.PatikaStore;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Laptop extends Urunler {

    Musteri musteri = new Musteri();
    static int laptopMarkaSecim;
    static List<Laptop> secilenLaptop;

    public Laptop() {
    }

    public Laptop(int id, double fiyat, int indirimOrani, String stokMiktari, String urunAdi, String marka, String hafizaBilgisi,
                  String ekranBoyutu, String pilGucu, String ram, String renk) {
        super(id, fiyat, indirimOrani, stokMiktari, urunAdi, marka, hafizaBilgisi, ekranBoyutu, pilGucu, ram, renk);
    }

    static String[] LaptopMarkalar = {"Samsung", "Lenovo", "Apple", "Huawei", "Casper", "Asus", "HP", "Monster"};

    List<Laptop> elimizdekiLaptoplar() {
        setStokMiktari();
        Laptop laptop1 = new Laptop(getId(), 1500, 10, setStokMiktari(), "Nirvana", "Casper", "128 gb", "15.6", "4000", " 4 gb", "Siyah");
        Laptop laptop2 = new Laptop(getId(), 2000, 5, setStokMiktari(), "G50", "Lenovo", "128 gb", "15.6", "5000", " 4 gb", "Siyah");
        Laptop laptop3 = new Laptop(getId(), 2500, 15, setStokMiktari(), "Pavilion", "HP", "256 gb", "15.6", "5000", " 6 gb", "Gri");
        Laptop laptop4 = new Laptop(getId(), 3000, 25, setStokMiktari(), "TUF", "Asus", "256 gb", "17", "3000", " 6 gb", "Kirmizi");
        Laptop laptop5 = new Laptop(getId(), 4000, 10, setStokMiktari(), "MateBook", "Huawei", "1512 gb", "15.6", "4000", " 8 gb", "Mavi");
        Laptop laptop6 = new Laptop(getId(), 5000, 20, setStokMiktari(), "GalaxyBook", "Samsung", "512 gb", "13.3", "5000", " 8 gb", "Siyah");
        Laptop laptop7 = new Laptop(getId(), 8000, 25, setStokMiktari(), "Razer X", "Monster", "1 tb", "15.6", "5000", " 16 gb", "Gri");
        Laptop laptop8 = new Laptop(getId(), 12000, 15, setStokMiktari(), "Macbook Air", "Apple", "1 tb", "13.3", "5000", " 16 gb", "Gri");

        return Arrays.asList(laptop1, laptop2, laptop3, laptop4, laptop5, laptop6, laptop7, laptop8);
    }

    void kullaniciLaptopSecim(String[] arr, int secim) {
        secilenLaptop = elimizdekiLaptoplar().stream().filter(t -> t.getMarka().equals(arr[secim - 1])).collect(Collectors.toList());
    }

    void laptopMarkaDondur() {
        System.out.println("Listeden marka seciniz");
        for (int i = 0; i < LaptopMarkalar.length; i++) {
            System.out.println((i + 1) + ". " + LaptopMarkalar[i]);
        }
        Scanner scan = new Scanner(System.in);
        laptopMarkaSecim = scan.nextInt();
        if (laptopMarkaSecim >= 1 && laptopMarkaSecim <= 7) {
            kullaniciLaptopSecim(LaptopMarkalar, laptopMarkaSecim);
            laptopIslemleri();
        } else laptopMarkaDondur();
    }

    void laptopIslemleri() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.Urun Ozellikleri\n2.Urun Fiyat Bilgileri\n3.Satin Alma Islemleri\n4.Ana menu");
        int telIslemSecimi = scan.nextInt();
        switch (telIslemSecimi) {
            case 1 -> {
                System.out.println("*************************************");
                System.out.println("Marka : " + secilenLaptop.get(0).getMarka()
                        + "\nModel : " + secilenLaptop.get(0).getUrunAdi());
                System.out.println("*************************************");
                laptopIslemleri();
            }
            case 2 -> {
                System.out.println("*************************************");
                System.out.println("Fiyat : " + secilenLaptop.get(0).getFiyat() + " TL"
                        + "\nIndirim Orani : %" + secilenLaptop.get(0).getIndirimOrani()
                        + "\nIndirimli Fiyat : " + (secilenLaptop.get(0).getFiyat() -
                        (((double) secilenLaptop.get(0).getIndirimOrani() / 100)
                                * secilenLaptop.get(0).getFiyat())) + " TL"
                        + "\nStok Durumu : " + secilenLaptop.get(0).getStokMiktari());
                System.out.println("*************************************");
                laptopIslemleri();
            }
            case 3 -> {
                System.out.println("*************************************");

                if (secilenLaptop.get(0).getStokMiktari().equalsIgnoreCase("Stokta mevcut")) {
                    musteri.musteriBilgileri();
                    System.out.println("*************************************");
                    satinAlma();
                    System.exit(0);
                } else {
                    System.out.println("*************************************");
                    System.out.println("Urun stokta olmadigindan satin alma islemi gerceklestirilemiyor...");
                    laptopIslemleri();
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
                    "\n------------------------------"
                    + "\nUrun Bilgileri : \n" + secilenLaptop.toString()+
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
