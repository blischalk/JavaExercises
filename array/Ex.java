public class Ex{
  public static void main(String[] args) {
    String[] s = new String[2];
    s[0] = "First";
    s[1] = "Second";
    for(String str : s) {
      System.out.println(str);
    }
    // Exceeding the array bounds throws ArrayIndexOutOfBounds which is a RuntimeException
    s[2] = "Third";
  }
}
