public class Indexing{
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    sb.append("this is some text");
    sb.insert(0, "This is inserted first.  ");
    System.out.println(sb.toString());
  }
}
