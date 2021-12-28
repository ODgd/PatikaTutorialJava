package PatikaÖdevleri.InsuranceManagement;

import java.util.Date;

public class HealthInsurance extends Insurance{
    public HealthInsurance(String sigortaIsmi, Double sigortaUcreti, Date sigortaBaslangic, Date sigortaBitis) {
        super(sigortaIsmi, sigortaUcreti, sigortaBaslangic, sigortaBitis);
    }

    @Override
    void calculate() {

    }
}
