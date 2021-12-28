package PatikaÖdevleri.InsuranceManagement;

import java.util.Date;

public class TravelInsurance extends Insurance{
    public TravelInsurance(String sigortaIsmi, Double sigortaUcreti, Date sigortaBaslangic, Date sigortaBitis) {
        super(sigortaIsmi, sigortaUcreti, sigortaBaslangic, sigortaBitis);
    }

    @Override
    void calculate() {

    }
}
