public class Knoten extends Baumelement
{
   Baumelement l,r;
   Datenelement data;
   
   public Knoten(Datenelement d) {
     data = d;
     l = Abschluss.getAbschluss();
     r = Abschluss.getAbschluss();
   }
   
   public Knoten hintenEinfuegen(Knoten k) {
     if(k.getID()<this.getID()) {
       l = l.hintenEinfuegen(k);
     }
     else {
       r = r.hintenEinfuegen(k);
     }
     return this;
   }
   
   public Baumelement entfernen(int id) {
     if(l.getID() == id)
     {
        Baumelement ret = l;
        l = Abschluss.getAbschluss(); 
        return ret;         
     }
     else {
        if(r.getID() == id) {
           Baumelement ret = r;
           r = Abschluss.getAbschluss();
           return ret;
        }
        else {
          Baumelement k = l.entfernen(id);
          Baumelement j = r.entfernen(id);
          if(k == null && j == null) {
            return null;
          }
          else {
             if(k==null) {
                return j;
             }
             else {
                return k;   
             }
          }
        }
     }
   }
   
   public Baumelement suchen(int id) {
      if(l.getID() == id) {
         return l;  
      }
      else {
         if(r.getID() == id) {
            return r;   
         }
         else {
            Baumelement k = l.suchen(id);
            Baumelement j = r.suchen(id);
            if(k==null && j==null) {
               return null;
            }
            else {
               if(k==null) {
                  return j; 
               }
               else {
                  return k; 
               }
            }
         }
      }
   }
   
   // ausgeben
   
   public void ausgebenPre() {
     System.out.print(this.getID()+" "); 
     l.ausgebenPre();   
     r.ausgebenPre();        
   }
   
   public void ausgebenIn() {
      l.ausgebenIn();
      System.out.print(this.getID()+" ");
      r.ausgebenIn();
   }
   
   public void ausgebenPost() {
      l.ausgebenPost();
      r.ausgebenPost();
      System.out.print(this.getID()+ " ");
   }
   
   public int getID() {
     return data.getID(); 
   }
   
   public Datenelement getdata() {
     return data; 
   }
   
   public Baumelement getl() {
      return l;
   }
   
   public Baumelement getr() {
      return r; 
   }
}
