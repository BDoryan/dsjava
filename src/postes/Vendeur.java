package postes;

public class Vendeur extends Commercial {

    /**
     * Construction d'un vendeur
     *
     * @param firstname le prénom
     * @param lastname le nom
     * @param dateEntrer la date d'entrer
     * @param age l'âge
     * @param caMentuel le chiffre d'affaire mensuel
     */
    public Vendeur(String firstname, String lastname, String dateEntrer, int age, double caMentuel) {
        super(firstname, lastname, dateEntrer, age, caMentuel);
    }
    @Override
    public double calculerSalaiare() {
        return super.calculerSalaiare() + 400;
    }

    @Override
    public String getTitre() {
        return "Je suis un vendeur";
    }

    @Override
    public String getNom() {
        return "Le vendeur " + this.getFirstname() + " " + this.getLastname();
    }
}
