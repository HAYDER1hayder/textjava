package dz.univeloued.apps;

import dz.univeloued.classes.Employe;
import dz.univeloued.classes.Etudiant;
import dz.univeloued.classes.Enseignant;
import dz.univeloued.classes.Personne;

@SuppressWarnings("unused")
public class Application {
    public static void main(String[] args) {
        System.out.println("la liste des Employe:");
        Employe e1 = new Employe();
        Employe e2 = new Employe();
        e1.setNom("HAIDER");
        e1.setPrenom("Messaoudi");
        e1.setSalaire(10000.00);
        e2.setNom("FARH");
        e2.setPrenom("Djamel");
        e2.setSalaire(10000.00);

        System.out.println(e1.toString());
        System.out.println(e2.toString());

        System.out.println("la liste des Etudiant:");
        Etudiant e3 = new Etudiant();
        Etudiant e4 = new Etudiant();
        e3.setNom("OBAKA");
        e3.setPrenom("Med");
        e3.setCount(6475485);
        e4.setNom("KHALFI");
        e4.setPrenom("Messoud");
        e4.setCount(6858495);

        System.out.println(e3.toString());
        System.out.println(e4.toString());

        System.out.println("la liste des Etudiant:");
        Enseignant e5 = new Enseignant();
        Enseignant e6 = new Enseignant();
        e5.setNom("OKBA");
        e5.setPrenom("kamal");
        e5.setSalaire(67000.00);
        e5.setSpecialite("JAVA/JEE");
        e6.setNom("Mohamed");
        e6.setPrenom("Cheick");
        e6.setSalaire(55000.00);
        e6.setSpecialite("Mathematique");


        System.out.println(e5.toString());
        System.out.println(e6.toString());

    }

}
