public class Baum {
    Baumelement wurzel;
    
    public Baum() {
        wurzel = Abschluss.getAbschluss(); 
    }

    // einfuegen, entfernen, suchen
    
    public void hintenEinfuegen(Datenelement neu) {
        Knoten k = new Knoten(neu);
        wurzel = wurzel.hintenEinfuegen(k);

    }

    public Datenelement entfernen(int id) {
        if(wurzel.getID()==id) {
            Baumelement w = wurzel;
            wurzel = Abschluss.getAbschluss();
            return w.getdata();
        }
        else {
            Baumelement tmp = wurzel.entfernen(id);
            if(tmp == null) {
              return null;
            }
            else {
              return tmp.getdata();
            }
        }
    }

    public Datenelement suchen(int id) {
        if(wurzel.getID()==id) {
            return wurzel.getdata();   
        }
        else {
            return wurzel.suchen(id).getdata();
        }
    }
    
    // ausgeben
    
    public void ausgebenPre() {
        System.out.println();
        wurzel.ausgebenPre();    
    }
    
    public void ausgebenPost() {
        System.out.println();
        wurzel.ausgebenPost();
    }
    
    public void ausgebenIn() {
        System.out.println();
        wurzel.ausgebenIn();
    }
}
