public class Ex {
  final String myVar;
  Ex() {
    // This initialization is necesssary for final variables
    // Final variables must be initialized by the time the constructor
    // is completed.
    myVar = "My String";
  }
  public static void main (String [] args)
  {
    Ex e = new Ex();
  }
}
