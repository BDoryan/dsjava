package postes;

import implementables.EmployeARisque;

public class TechnARisque extends Technicien implements EmployeARisque {

    public TechnARisque(String firstname, String lastname,  String dateEntrer, int age, int nbrProduits) {
        super(firstname, lastname, dateEntrer, age, nbrProduits);
    }

    @Override
    public double calculerSalaiare() {
        return super.calculerSalaiare() + getPrime();
    }
}
