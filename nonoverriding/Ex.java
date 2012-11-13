/**
 * Static methods are not inherited!!!
 * Since static methods are not inherited, including a method by the same name and signature
 * is in essence declaring a completely new method.
 * Non-overridden methods are invoked based on the reference variable type and not the actual object time at runtime.
 * Overridden methods use the objects actual type at runtime.
 */
public class Ex {
  public static void main (String [] args)
  {
    Parent p = new Parent();
    Parent c = new Child();
    Child ch = new Child();
    p.tryMe();
    c.tryMe();
    ch.tryMe();
    p.another();
    c.another();
    ch.another();
  }
}
class Parent{
  public static void tryMe(){
    System.out.println("In Parent Method");
  }
  public void another(){
    System.out.println("In Parent Method");
  }
}
class Child extends Parent{
  public static void tryMe(){
    System.out.println("In Child Method");
  }
  public void another(){
    System.out.println("In Child Method");
  }
}
