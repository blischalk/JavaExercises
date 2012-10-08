import java.io.*;
public class FileEx4{
  public static void main(String[] args) {
    try{
      // Read from an existing directory
      File d = new File("myDirectory");
      // Read an existing file from that directory
      File f = new File(d, "existing.txt");
      FileReader fr = new FileReader(f);
      BufferedReader br = new BufferedReader(fr);
      String line;
      while((line = br.readLine()) != null) {
        System.out.println(line);
      }
      br.close();
    } catch(IOException e) {}
  }
}
