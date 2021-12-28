package PatikaÖdevleri.InsuranceManagement;

import java.util.Date;

public abstract class Insurance {

    private String sigortaIsmi;
    private Double sigortaUcreti;
    private Date sigortaBaslangic, sigortaBitis;

    public Insurance(String sigortaIsmi, Double sigortaUcreti, Date sigortaBaslangic, Date sigortaBitis) {
        this.sigortaIsmi = sigortaIsmi;
        this.sigortaUcreti = sigortaUcreti;
        this.sigortaBaslangic = sigortaBaslangic;
        this.sigortaBitis = sigortaBitis;
    }

    abstract void calculate();
}
