import java.util.*;
import java.util.Arrays;
public class Ex1{
  public static void main(String[] args) {
    ArrayList<String> myList = new ArrayList<String>();
    myList.add("C");
    myList.add("B");
    Collections.sort(myList);
    for(String str: myList) {
      System.out.println(str);
    }
  }
}
