public class InheritanceTest{
  void amethod(int i) {}
  public static void main(String[] args) {
  }
}
class MySubclass extends InheritanceTest
{
  // Must change arguments to override / overload
  public int amethod(int i, String s) {return 0;}
}
