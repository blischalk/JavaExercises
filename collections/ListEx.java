import java.util.*;
public class ListEx{
  public static void main(String[] args) {
    List<Person> pl = new ArrayList<Person>();
    Person p = new Person("Brett");
    pl.add(p);
    pl.add(new Person("Charles"));
    pl.add(new Person("Dan"));
    Iterator<Person> pi = pl.iterator();
    while(pi.hasNext()) {
      System.out.println(pi.next().name);
    }
  }
}
class Person{
  String name;
  Person(String n) {
    name = n;
  }
}
