package PatikaÖdevleri.InsuranceManagement;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {

  private   String isim, soyisim, email, sifre, meslek;
  private   int yas;
  private   Date sonGiris;

    List<Adress> adressList = new ArrayList<>();

    public User(String isim, String soyisim, String email, String sifre, String meslek, int yas, Date sonGiris, List<Adress> adressList) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.email = email;
        this.sifre = sifre;
        this.meslek = meslek;
        this.yas = yas;
        this.sonGiris = sonGiris;
        this.adressList = adressList;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getMeslek() {
        return meslek;
    }

    public void setMeslek(String meslek) {
        this.meslek = meslek;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public Date getSonGiris() {
        return sonGiris;
    }

    public void setSonGiris(Date sonGiris) {
        this.sonGiris = sonGiris;
    }

    public List<Adress> getAdressList() {
        return adressList;
    }

    public void setAdressList(List<Adress> adressList) {
        this.adressList = adressList;
    }
}
