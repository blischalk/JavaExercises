public class Ex {
  public static void main (String [] args)
  {
    Parent p = new Parent();
    Child c = new Child();
  }
}
class Parent{
  public A getA(String str){
    return new A();
  }
}
class Child extends Parent{
  // This return type must be the same or a sub-type of A, the parent methods return type.
  public B getA(String str){
    return new B();
  }
}
interface I{ 
  // The below is not allowed.  Interface methods must be public
  // protected void myMethod();
  // This is implicitly public
  void myMethod();
}
class Letter{} 
class A extends Letter implements I{
  public void myMethod(){};
}
class B extends A{
}

