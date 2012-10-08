// File: class doesn't actually do any file reading or writing.  It works at a higher level creating empty files, directories, searching for files, deleting files and working with paths.
// FileReader: class is used to read character files. Its read methods are fairly low-level allowing you to read single characters.  FileReaders are
// usually wrapped by higher level objects such as BufferedReaders which imporves performance and provide more convenient ways to work with data.
// BufferedReader: is used to make lower-level Reader classes like FileReader more efficient and easier to use.  BufferedReaders read relatively large chunks of data from a file at once and keep this data in a buffer.
// FileWriter: is used to write to character files.  FileWriters are usually wrapped in higher level Writer objects such as BufferedWriters or PrintWriters.
// BufferedWriter: used to make lower level classes like FileWriters more efficient and easier to use.
// PrintWriter:
// Console: Convenience class provides methods to read input from the console and write formatted output to the console.
import java.io.*;
public class FileEx{
  public static void main(String[] args) {
    char[] in = new char[50];
    int size = 0;
    try{
      File file = new File("fileWrite2.txt");  // Just creating an object here
      FileWriter fw = new FileWriter(file); // Create an actual file and a FileWriter obj
      fw.write("Hello\nBrett\n"); // write characters to the file
      fw.flush(); // flush before closing to make sure all data is written to file
      fw.close(); // call close to free up expensive resources used in file i/o
      FileReader fr = new FileReader(file); // Create a FileReader obj
      size = fr.read(in); // read the whole file!
      System.out.print(size + " "); // how many bytes read
      for(char c : in) // print the array
        System.out.print(c);
      fr.close(); // Free up resources by calling close
    } catch(IOException e) {}
  }
}

// Because you have to manually add new lines and because you need to create a char array
// big enough to store an entire file it is more conveient to work with a higher level class
