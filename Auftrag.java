public class Auftrag implements Datenelement {
   private int d;
   private int i;
   
   public Auftrag(int data, int id) {
     d = data;
     i = id;
   }
   
   public Datenelement getdata() {
     return this; 
   }
   
   public int getID() {
     return i; 
   }
}
