package postes;

public class Technicien extends Employe {

    private int nbrProduits = 0;

    public Technicien(String firstname, String lastname,  String dateEntrer, int age, int nbrProduits) {
        super(firstname, lastname, dateEntrer, age);
        this.nbrProduits = nbrProduits;
    }

    /**
     * @return le nombre de produit du technicien
     */
    public int getNbrProduits() {
        return nbrProduits;
    }

    /**
     * 5€ par produit
     *
     * @return
     */
    @Override
    public double calculerSalaiare() {
        return nbrProduits * 5;
    }

    @Override
    public String getTitre() {
        return "Je suis technicien !";
    }

    @Override
    public String getNom() {
        return "Le technicien "+this.getFirstname()+" "+this.getLastname();
    }
}
