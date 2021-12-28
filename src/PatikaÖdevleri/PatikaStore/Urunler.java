package PatikaÖdevleri.PatikaStore;

public class Urunler {

    private int id = 101;
    private double fiyat;
    private int indirimOrani;
    private String stokMiktari;
    private String urunAdi, marka, hafizaBilgisi, ekranBoyutu, pilGucu, ram, renk;

    public int getId() {
        this.id++;
        return id;
    }

    public double getFiyat() {
        return fiyat;
    }

    public int getIndirimOrani() {
        return indirimOrani;
    }

    public String getStokMiktari() {
        return stokMiktari;
    }

    public String setStokMiktari() {
        int random = (int) (Math.random() * 10);
        String stokMiktari = random > 3 ? "Stokta mevcut" : "Stokta mevcut degil";
        this.stokMiktari = stokMiktari;
        return stokMiktari;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public String getMarka() {
        return marka;
    }

    public Urunler() {
    }

    public Urunler(int id, double fiyat, int indirimOrani, String stokMiktari, String urunAdi,
                   String marka, String hafizaBilgisi, String ekranBoyutu, String pilGucu,
                   String ram, String renk) {
        this.id = id;
        this.fiyat = fiyat;
        this.indirimOrani = indirimOrani;
        this.stokMiktari = stokMiktari;
        this.urunAdi = urunAdi;
        this.marka = marka;
        this.hafizaBilgisi = hafizaBilgisi;
        this.ekranBoyutu = ekranBoyutu;
        this.pilGucu = pilGucu;
        this.ram = ram;
        this.renk = renk;

    }
    String hediyeUrun(){
        String [] hediyeUrunler = {"Kulaklik", "100 TL Hediye Ceki", "Akilli Saat", "PS Oyunu", "Sarj Adaptoru", "Tiras Makinesi"};
        int random = (int)(Math.random()*5);
        return hediyeUrunler[random];
    }

    @Override
    public String toString() {
        return "Id : " + id +
                ", Fiyat : " + fiyat +
                ", Indirim Orani : %" + indirimOrani +
                "\nStok Miktari : '" + stokMiktari + '\'' +
                ", Model : '" + urunAdi + '\'' +
                ", Marka : '" + marka + '\'' +
                "\nHafiza Bilgisi : '" + hafizaBilgisi + '\'' +
                ", Ekran Boyutu : '" + ekranBoyutu + '\'' +
                ", Pil Gucu : '" + pilGucu + '\'' +
                ", RAM : '" + ram + '\'' +
                ", Renk : '" + renk;
    }
}
