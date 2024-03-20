package postes;

public class Manutentionnaire extends Employe {

    private int nbrHeures = 0;

    /**
     * @param nbrHeures le nombre d'heures
     */
    public Manutentionnaire(String firstname, String lastname,  String dateEntrer, int age, int nbrHeures) {
        super(firstname, lastname, dateEntrer, age);
        this.nbrHeures = nbrHeures;
    }

    /**
     * @return le nombre d'heures effectués par le manutentionnaire
     */
    public int getNbrHeures() {
        return nbrHeures;
    }

    /**
     * Le salaire est de le 65€/h
     */
    @Override
    public double calculerSalaiare() {
        return nbrHeures * 65;
    }

    @Override
    public String getTitre() {
        return "Je suis manutentionnaire !";
    }

    @Override
    public String getNom() {
        return "Le manut. "+this.getFirstname()+" "+this.getLastname();
    }
}
