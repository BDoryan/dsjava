package postes;

public class Representant extends Commercial {

    public Representant(String firstname, String lastname,  String dateEntrer, int age, double caMensuel) {
        super(firstname, lastname, dateEntrer, age, caMensuel);
    }

    @Override
    public double calculerSalaiare() {
        return super.calculerSalaiare() + 800;
    }

    @Override
    public String getTitre() {
        return "Je suis commercial";
    }

    @Override
    public String getNom() {
        return "Le représentant "+this.getFirstname()+" "+this.getLastname();
    }
}
