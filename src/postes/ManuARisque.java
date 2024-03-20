package postes;

import implementables.EmployeARisque;

public class ManuARisque extends Manutentionnaire implements EmployeARisque {

    public ManuARisque(String firstname, String lastname,  String dateEntrer, int age, int nbrHeures) {
        super(firstname, lastname, dateEntrer, age, nbrHeures);
    }

    @Override
    public double calculerSalaiare() {
        return super.calculerSalaiare() + getPrime();
    }
}
