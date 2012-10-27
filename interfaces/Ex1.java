public class Ex1 implements MyInterface{
  /**
   * The below method will not compile because interface
   * methods are implicitly public.
   * When implementing an interface method that doesn't
   * declare its visibility the implementing class must declare it public
   */
  /*
  void myMethod() {
    System.out.println("Compiles?");
  }
  */

  public void myMethod() {
    System.out.println("Compiles?");
  }

  public static void main(String[] args) {

  }
}
interface MyInterface{
  // This method is implicitly public!!!
  void myMethod();
}
