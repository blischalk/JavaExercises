// This will not compile because the compiler sees a string varargs as a string array essentially
// making both f methods identical and confusing the compiler
public class VarArgEx1{
  public static void f(String... a) {
    for(String i : a)
      System.out.print("A"+i);
  }
  public static void f(String[] a) {
    for(String i : a)
      System.out.print("B"+i);
  }
  public static void main(String[] str) {
    f(str);
  }
}
