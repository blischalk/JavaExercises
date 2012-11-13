import java.util.*;
public class Ex{
  public static void main(String[] args) {
    ArrayList<? extends Object> al = new ArrayList<String>();
    ArrayList<String> sal = (ArrayList<String>)al;
    sal.add("First");
    for(String str : sal){
      System.out.println(str);
    }
  }
}
