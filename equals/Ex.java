public class Ex{
  public static void main(String[] args) {
    MyClass mc = new MyClass();
    MyClass mc2 = new MyClass();
    String s = "A String";
    System.out.println(mc.equals(mc2));
    System.out.println(mc2.equals(mc));
    System.out.println(s.equals(mc));
    System.out.println(mc.equals(s));
  }
}

class MyClass{
  public boolean equals(Object obj) {
    if (obj instanceof String) {
      return true;
    } else {
      return false;
    }
  }
}
