import java.util.*;
public class ArrayToList{
  public static void main(String[] args) {
    String[] s = {"first", "second", "third", "fourth", "fifth"};
    List<String> l = Arrays.asList(s);
    s[3] = "test";
    l.set(4, "ing");
    for(String st : s)
      System.out.println(st);
  }
}
