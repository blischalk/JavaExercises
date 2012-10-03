import java.util.regex.*; // Regex is within util
public class RegexExercise1{
  public static void main(String[] str) {
    // Regular expression to use
    String regex = "(\\w+)@(\\w+\\.)(\\w+)(\\.\\w+)*";
    // String to search using regex
    String search = "The e-mail ids are tom@abc.com and harry@xyz.com";
    // Create a regex pattern object from a string
    Pattern pattern = Pattern.compile(regex);
    // Create a matcher that will match the input against a pattern
    Matcher matcher = pattern.matcher(search);
    // while the matcher has matches
    while(matcher.find()) {
      // Print out each email id that is found.
      System.out.println("The e-mail id is: " + matcher.group());
      System.out.println("The pre @ is: " + matcher.group(1));
      System.out.println("The post @ is: " + matcher.group(2));
    }
  }
}
