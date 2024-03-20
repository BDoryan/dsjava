import postes.*;

public class Main {

    public static void main(String[] args) {
        Personnel p = new Personnel();
        p.ajouterEmploye(new Vendeur("Pierre", "Business", "1995", 45, 30000));
        p.ajouterEmploye(new Representant("Léon", "Vendtout", "2001", 25, 20000));
        p.ajouterEmploye(new Technicien("Yves", "Bosseur", "1998",28, 1000));
        p.ajouterEmploye(new Manutentionnaire("Jeanne", "Stocketout", "1998", 32, 45));
        p.ajouterEmploye(new TechnARisque("Jean", "Flippe", "2000", 28, 1000));
        p.ajouterEmploye(new ManuARisque("Al", "Abordage", "2001", 30, 45));
        p.calculerSalaires();
        p.salaireMoyen();
    }
}