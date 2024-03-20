package postes;

import implementables.Titrable;

public abstract class Employe implements Titrable {

    private String firstname, lastname, dateEntrer;
    private int age;

    /**
     *
     * @param firstname le prénom
     * @param lastname le nom
     * @param dateEntrer la date d'entrée
     * @param age l'âge de l'employé
     */
    public Employe(String firstname, String lastname, String dateEntrer, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateEntrer = dateEntrer;
        this.age = age;
    }


    /**
     * Cette méthode doit être utiliser afin de calculer le salaire des employés
     *
     * @return le résultat du salaire (en double)
     */
    public abstract double calculerSalaiare();

    public String getNom() {
        return "L'employé " + this.firstname + ' ' + this.lastname;
    }

    /**
     * Définir le prénom de l'employé
     *
     * @param firstname le prénom
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Définir le nom de l'employé
     *
     * @param lastname le nom
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Définir l'âge de l'employé
     *
     * @param age l'âge de l'employé
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return le prénom de l'employé
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Définir la date d'entrée de l'employé
     * @param dateEntrer la date d'entrée
     */
    public void setDateEntrer(String dateEntrer) {
        this.dateEntrer = dateEntrer;
    }

    /**
     * @return le nom de l'employé
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @return la date d'entrée l'employé
     */
    public String getDateEntrer() {
        return dateEntrer;
    }

    /**
     * @return l'âge de l'employé
     */
    public int getAge() {
        return age;
    }
}
