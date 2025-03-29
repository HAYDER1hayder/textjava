package dz.univeloued.classes;

public class Enseignant extends Employe {
    private String specialite;

    public Enseignant() {
    }

    public String getSpecialite() {
        return this.specialite;
    }

    public void setSpecialite(String var1) {
        this.specialite = var1;
    }

    public String toString() {
        return super.toString() + " ma specialite est : " +specialite+ "";
    }
    
}
