public abstract class Baumelement {
   public abstract Knoten hintenEinfuegen(Knoten k);
   public abstract Baumelement entfernen(int id);
   public abstract int getID();
   public abstract Datenelement getdata();
   public abstract Baumelement suchen(int id);
   public abstract void ausgebenPre();
   public abstract void ausgebenIn();
   public abstract void ausgebenPost();
   public abstract Baumelement getl();
   public abstract Baumelement getr();
}
