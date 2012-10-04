import java.util.*;
public class FormattingEx1 {
  public static void main(String[] str) {
    // StringBuilder allows you to create a mutable string.  Strings are not mutable.
    StringBuilder sb = new StringBuilder();
    // Formatter formats printf style strings
    Formatter f = new Formatter(sb, Locale.US);
    // Actual formatting is done via the format method
    f.format("PI=%12.10f", Math.PI);
    System.out.println(f);
  }
}
