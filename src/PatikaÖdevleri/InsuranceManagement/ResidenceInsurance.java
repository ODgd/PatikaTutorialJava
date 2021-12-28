package PatikaÖdevleri.InsuranceManagement;

import java.util.Date;

public class ResidenceInsurance extends Insurance{
    public ResidenceInsurance(String sigortaIsmi, Double sigortaUcreti, Date sigortaBaslangic, Date sigortaBitis) {
        super(sigortaIsmi, sigortaUcreti, sigortaBaslangic, sigortaBitis);
    }

    @Override
    void calculate() {

    }
}
