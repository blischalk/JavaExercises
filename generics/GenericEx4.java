import java.util.*;
public class GenericEx4{
  public static void main(String[] args) {
    ArrayList l = new ArrayList<String[]>();

    // Warning will be thrown while adding to the
    // Legacy ArrayList but no compiler error will occur.
    l.add(new String[]{"First", "Second"});
    l.add(new String[]{"Third", "Fourth"});


    // Here though, before we assign something from the ArrayList to a
    // variable we must cast or a compiler error will occur
    String[] s = (String[])l.get(0);
    for(String str: s)
      System.out.println(str);

    String[] s1 = (String[])l.get(1);
    for(String str1: s1)
      System.out.println(str1);
  }
}
