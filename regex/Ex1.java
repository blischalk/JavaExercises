public class Ex1{
  public static void main(String[] args) {
    String str = "aaaaaaaaabb";
    String[] s = str.split("a{3}");
    System.out.println(s.length);
    for(String str2: s)
      System.out.println(str2);
  }
}
