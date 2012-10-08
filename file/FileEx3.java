import java.io.*;
public class FileEx3{
  public static void main(String[] args) {
    try {
      // Create a directory object
      File d = new File("myDirectory");
      // Actually create the directory
      d.mkdir();
      // Now that we have a directory, add a file
      // Create a file object with a directory
      File fd = new File(d, "myFile");
      fd.createNewFile();
      PrintWriter pw = new PrintWriter(new FileWriter(fd));
      pw.println("Printing some text");
      pw.flush();
      pw.close();
    } catch (IOException e) {}
  }
}
