package dz.univeloued.classes;

public class Etudiant extends Personne {
   private String mat;
   protected String domain;

   public Etudiant(){
   }

   public String getMat() {
      return this.mat;
   }

   public void setMat(String var1) {
      this.mat = var1;
   }

   public String toString() {
      return super.toString() +nom+" "+prenom+ " mon mat est : " +Count+ "";
   }

}
