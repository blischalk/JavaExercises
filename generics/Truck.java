import java.util.*;
public class Truck{
  public static void main(String[] args) {
    TreeSet<Integer> times = new TreeSet<Integer>();
    times.add(1212);
    times.add(1512);
    times.add(1830);
    times.add(2020);
    times.add(2100);

    // J5

    TreeSet<Integer> subset = new TreeSet<Integer>();
    subset = (TreeSet<Integer>)times.headSet(1600);
    System.out.println("In java 5 the last time before 4pm is: " + subset.last());

    TreeSet<Integer> sub2 = new TreeSet<Integer>();
    sub2 = (TreeSet<Integer>)times.tailSet(2000);
    System.out.println("In java 5 the first time after 8pm is: " + sub2.first());

    // J6
    System.out.println("In java 6 the last time before 4pm is: " + times.lower(1600));
    System.out.println("In java 6 the first time after 8pm is: " + times.higher(2000));
  }
}
