public class Abschluss extends Baumelement
{
   public static final Abschluss a = new Abschluss();
   private Abschluss() {}
   
   public static Abschluss getAbschluss() {
      return a;
   }
   
   public Knoten hintenEinfuegen(Knoten k) {
      return k;
   }
   
   public Baumelement entfernen(int id) {
      return null;
   }
   
   public Baumelement suchen(int id) {
      return null; 
   }
   
   public void ausgebenPre() {}
   
   public int getID() {
     return Integer.MAX_VALUE; 
   }
   
   public Datenelement getdata() {
      return null;
   }
   
   public void ausgebenIn() {}
   
   public void ausgebenPost() {}
   
   public Baumelement getl() {
     return this; 
   }
   
   public Baumelement getr() {    
      return this;
   }
}
