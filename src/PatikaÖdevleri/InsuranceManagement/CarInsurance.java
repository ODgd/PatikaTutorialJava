package PatikaÖdevleri.InsuranceManagement;

import java.util.Date;

public class CarInsurance extends Insurance{
    public CarInsurance(String sigortaIsmi, Double sigortaUcreti, Date sigortaBaslangic, Date sigortaBitis) {
        super(sigortaIsmi, sigortaUcreti, sigortaBaslangic, sigortaBitis);
    }

    @Override
    void calculate() {

    }
}
