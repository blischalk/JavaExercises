// Ordered: The order in which a collection can be iterated.  The order is independent of value.  Like a List.
// Sorted: The order in the collection is determined by a sort order. Has order and the order is dependant on the values of the elements.  Often times the naturalorder.  Ex: SortedSet
import java.util.*;
public class CollectionEx1{
  public static void main(String[] args) {
    TreeSet<String> ss = new TreeSet<String>();
    ss.add("First string");
    ss.add("Second string");
    // This element begins with "A" so it will be placed first by natural order.
    ss.add("Another string");
    for(String s : ss)
      System.out.println(s);
  }
}
