import java.util.*;
public class CollectionEx2{
  public static void main(String[] args) {
    ArrayList<? extends Object> al =  new ArrayList();
    // This doesn't compile because you can't add to a collection of unknown type
    al.add("test");
  }
}
