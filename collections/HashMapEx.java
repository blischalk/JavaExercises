import java.util.*;
// Allows null vaules and null key
// No guarantee of the order of elements
public class HashMapEx{
  public static void main(String[] args) {
    // Will give a warning
    HashMap m = new HashMap();
    m.put("key1", "val1");
    System.out.println(m.get("key1"));

    // Won't give a warning
    HashMap<String, String> m1 = new HashMap<String, String>();
    m1.put("key1", "val1");
    System.out.println(m1.get("key1"));

    // Use some methods
    HashMap<String, String> m2 = new HashMap<String, String>();

    // Add a few elements
    m2.put("key1", "val1");
    m2.put("key2", "val3");

    // Remove all elements
    m2.clear();
    System.out.println(m2);
    m2.put("key1", "val1");
    System.out.println(m2.get("key1"));
    System.out.println(m2.containsKey("key1"));
    System.out.println(m2.containsValue("val1"));
    m2.put("key2", "val2");
    m2.put("key3", "val3");
    m2.put("key4", "val4");

    // Print out the size
    System.out.println(m2.size());

    // Print out the values
    System.out.println(m2.values());

    // Remove an element
    m2.remove("key3");
    System.out.println(m2);

    // Return elements as a set
    System.out.println(m2.entrySet());
    Set<Map.Entry<String, String>> s = m2.entrySet();
    System.out.println(s);

    System.out.println(m2.keySet());
    Set<String> s1 = m2.keySet();
    System.out.println(s1);

    // Duplicate a map
    HashMap<String, String> m3 = new HashMap<String, String>();
    m3.putAll(m2);
    System.out.println(m3);
  }
}
