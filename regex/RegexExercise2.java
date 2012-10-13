import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExercise2 {

  public static void main(String[] av) {
    String joke = "dog " + "dogs";
    String regEx = "dog";

    Pattern doggone = Pattern.compile(regEx);
    Matcher m = doggone.matcher(joke);

    StringBuffer newJoke = new StringBuffer();
    while (m.find()) {
      m.appendReplacement(newJoke, "goat");
    }
    m.appendTail(newJoke);
    System.out.println(newJoke.toString());
  }

}

           
