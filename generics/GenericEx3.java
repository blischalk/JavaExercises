public class GenericEx3{
  public static void main(String[] args) {
    MyClass<Integer, String> m = new MyClass<Integer, String>(3, "Testing string");
    System.out.println(m.getT());
    System.out.println(m.getX());
    m.special("string", 2);
  }
}
class MyClass<T, X>{
  T one;
  X two;
  MyClass(T one, X two) {
    this.one = one;
    this.two = two;
  }
  T getT() { return one; }
  X getX() { return two; }
  public <T, X> void special(T s, X x) {
    System.out.println(s);
    System.out.println(x);
  }
}
