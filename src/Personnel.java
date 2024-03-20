import postes.Employe;

import java.util.ArrayList;

public class Personnel {

    private ArrayList<Employe> employes = new ArrayList<>();

    public void ajouterEmploye(Employe employe) {
        this.employes.add(employe);
    }

    /**
     * Affiche la liste le salaire calculer des différents employé
     */
    public void calculerSalaires() {
        for (Employe employe : this.employes) {
            System.out.println(employe.getNom() +" gagne "+ employe.calculerSalaiare()+" euros.");
        }
    }

    /**
     * Affiche le salaire moyen
     */
    public void salaireMoyen() {
        double salaireMoyen = this.employes.stream().mapToDouble(
                employe -> (double) employe.calculerSalaiare()
        ).sum() / this.employes.size();

        System.out.println("Le salaire moyen du personnel est de "+salaireMoyen);
    }
}
