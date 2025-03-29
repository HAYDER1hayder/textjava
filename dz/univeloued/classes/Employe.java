package dz.univeloued.classes;

public class Employe extends Personne {
    protected double salaire;

    public Employe() {
    }

    public String toString() {
        return super.toString() + nom + " " + prenom + " mon salaire est : " + salaire + "DA";
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
}
