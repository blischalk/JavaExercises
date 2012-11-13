class A
{
  int x = 5;
  public String who() {
    System.out.println(x);
    return "I am A";
  }
}
class B extends A
{
  int x = 6;
  public String who() {
    System.out.println(x);
    return "I am B";
  }
}
public class Ex2{
  public A getObject(){
    System.out.println("parent called");
    return new A();
  }
  public static void main(String[] args) {
    Ex2 s = new SubEx2();
    A b = s.getObject();
    System.out.println(b.who());
    System.out.println(((B)b).x);
  }
}
class SubEx2 extends Ex2{
 public B getObject(){
   System.out.println("sub called");
   return new B();
 }
}
