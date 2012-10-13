import java.util.*;
public class GenericEx2{
  public static void main(String[] args) {
    // This won't work
    // Vector v = new Vector<? extends Shape>();
    Vector v = new Vector<Shape>();
  }
}
class Shape{
}
