public class Mutable{
  public static void main(String[] args) {
    StringBuilder sbuild = new StringBuilder("This is a mutable string");
    StringBuffer sbuff = new StringBuffer("This is another mutable string");
    String s = "This is an immutable string";

    // These strings will not create new constants in the String Constant Pool
    sbuild.append(".  This was appended");
    sbuff.append(".  This is appended to the buff");
    System.out.println(sbuild + " " + sbuff);

    s = s.concat(". Original string lost in pool");
    System.out.println(s);
  }
}
