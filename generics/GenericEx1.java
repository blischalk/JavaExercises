// IF YOU OVERRIDE EQUALS, OVERRIDE HASHCODE AS WELL
public class GenericEx1{
  public static void main(String[] args) {
    Boof one = new Boof(8);
    Boof two = new Boof(8);
    if (one.equals(two)) {
      System.out.println("one and two are equal.");
      System.out.println("The hashcode is... " + one.hashCode()); 
    }
  }
}
class Boof{
  private int boofValue;
  Boof(int i) {
    boofValue = i;
  }
  public int getboofValue() {
    return boofValue;
  }
  public boolean equals(Object o) {
    // This is the import part.  Instance of and cast
    if ((o instanceof Boof) && (((Boof)o).getboofValue() == this.boofValue)) {
      return true;
    } else {
      return false;
    }
  }
  public int hashCode() { return this.getboofValue(); }
}

