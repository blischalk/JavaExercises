public class CovariantEx1{
  public static void main(String[] str) {
    First o = new Second();
    // This cast to string is necessary.  Even though at run time the subclass will return a string
    // as method1 in the subclass returns a string, the compiler will complain because at compile time
    // the compiler sees the parent classes method1 which returns an object.
    String s = (String) o.method1();
    System.out.println(s);
  }
}

class First{
  public Object method1() {
    System.out.println("Calling super class method");
    return new String("Base");
  }
}

class Second extends First{
  public String method1() {
    System.out.println("Calling sub class method");
    return new String("Derived");
  }
}
