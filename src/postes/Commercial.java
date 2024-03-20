package postes;

public abstract class Commercial extends Employe {

    private double caMensuel = 0;

    /**
     * @param caMensuel définir le chiffre d'affaire mensuel
     */
    public Commercial(String firstname, String lastname,  String dateEntrer, int age, double caMensuel) {
        super(firstname, lastname, dateEntrer, age);
        this.caMensuel = caMensuel;
    }

    /**
     * @return le chiffre d'affaire que le commercial à fait sur le mois
     */
    public double getCa() {
        return caMensuel;
    }


    /**
     * @return le calcul de votre salaire
     */
    @Override
    public double calculerSalaiare() {
        return this.caMensuel * 0.20;
    }

    /**
     * @return le nom avec votre catégorie
     */
    @Override
    public String getNom() {
        return "Le commercial "+this.getFirstname()+" "+this.getLastname();
    }
}
