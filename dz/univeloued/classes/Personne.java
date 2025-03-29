package dz.univeloued.classes;

public class Personne {

    private int id;
    protected String nom;
    protected String prenom;
    static int Count;

    public Personne(){
    }

    @Override
    public String toString() {
        return "je suis ";
    }

    public void printf(int n) {
        System.out.println(n);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Personne.Count = count;
    } 

}
