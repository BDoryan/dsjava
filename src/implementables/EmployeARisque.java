package implementables;

public interface EmployeARisque {

    double EMPLOYE_A_RISQUE_PRIME = 200;

    /**
     * Vous pouvez réécrire cette methode
     *
     * @return la prime par défaut
     */
    default double getPrime() {
        return EMPLOYE_A_RISQUE_PRIME;
    }
}
