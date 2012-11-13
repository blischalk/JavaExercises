import java.text.NumberFormat;
import java.util.*;
public class Ex{
  public static void main(String[] args) {
    NumberFormat nf = NumberFormat.getInstance(Locale.ENGLISH);
    nf.setMaximumFractionDigits(2);
    nf.setMaximumIntegerDigits(2);
    Double d = 100023.2345;
    String s = nf.format(d);
    System.out.println(s);
  }
}
