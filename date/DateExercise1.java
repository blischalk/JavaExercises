import java.util.*; // Date, Calendar, and Local
import java.text.*; // DateFormat, NumberFormat
import static java.lang.System.out;

public class DateExercise1 {
  public static void main(String[] str) {
    String dateStr = "November 23, 1983"; // Create a string
    try {
      // Get a date formatter instance in long format for the us locale
      // Parse the date string using the formatter returned from DateFormat.getDateInstance
      // Parse throws a ParesException so it must be caught or declared to be thrown
      Date date = DateFormat.getDateInstance(DateFormat.LONG, Locale.US).parse(dateStr);
      // Print out the formatted date
      out.println(date); 
    } catch (ParseException e) {
      // Prints the exception
      out.println(e);
    }
  }
}
