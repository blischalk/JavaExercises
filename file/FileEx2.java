import java.io.*;
// There are two ways to create a file in java
public class FileEx2{
  public static void main(String[] args) {
    try {
      File f = new File("myTest.txt");
      f.createNewFile();
      PrintWriter pw = new PrintWriter(new FileWriter(f));
      pw.println("Hello joe");
      pw.flush();
      pw.close();

      File f2 = new File("myTest2.txt");
      FileWriter fw = new FileWriter(f2); // Creating a Writer or Stream
      fw.write("this is some text\nthis is some more");
      fw.flush();
      fw.close();
    } catch (IOException e) {}
  }
}
