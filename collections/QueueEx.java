import java.util.*;
public class QueueEx{
  public static void main(String[] args) {
    PriorityQueue<MyStuff> pq = new PriorityQueue<MyStuff>();
    pq.add(new MyStuff("Brett"));
    pq.add(new MyStuff("Adam"));
    pq.add(new MyStuff("Charlie"));

    // Print out the first in the priority queue
    System.out.println("First in the queue is " + pq.peek().getName());

    // Iterate over the queue
    Iterator<MyStuff> i = pq.iterator();
    System.out.println("Elements in the queue are...");
    while(i.hasNext()) {
      System.out.println(i.next().getName());
    }

    // Remove the first in the queue
    System.out.println("After polling the first item in the queue, we have...");
    pq.poll();
    i = pq.iterator();
    while(i.hasNext()) {
      System.out.println(i.next().getName());
    }

    // Add another element starting with A...  where does it go
    System.out.println("After adding another element starting with 'A', we have...");
    pq.add(new MyStuff("Aaron"));
    i = pq.iterator();
    while(i.hasNext()) {
      System.out.println(i.next().getName());
    }
    System.out.println("Priority of the queue is the comparable ordering");
  }
}

class MyStuff implements Comparable<MyStuff>{
  private String name;

  MyStuff(String n) {
    name = n;
  }

  public String getName(){
    return name;
  }

  public int compareTo(MyStuff m) {
    return name.compareTo(m.getName()); 
  }
}
