import java.io.*;
import java.util.*;
public class BooksEx{
  ArrayList<BookInfo> b = new ArrayList<BookInfo>();
  public static void main(String[] args) {
    BooksEx be = new BooksEx();
    be.populateList();
    System.out.println("Sorting by title using comparable.");
    Collections.sort(be.b);
    for(BookInfo t: be.b)
      System.out.println(t.getTitle());
    Collections.sort(be.b, new GenreSort());
    System.out.println("Sorting by genre using a comparator.");
    for(BookInfo t: be.b)
      System.out.println(t.getTitle());
  }
  public void populateList() {
    try{
      File f = new File("books.txt");
      BufferedReader br = new BufferedReader(new FileReader(f));
      String line;
      while((line = br.readLine()) != null) {
        String[] a = line.split("/");
        BookInfo bi = new BookInfo();
        bi.setTitle(a[0]);
        bi.setGenre(a[1]);
        bi.setWriter(a[2]);
        b.add(bi);
      }
      br.close();
    } catch(IOException e) {}
  }
}
class BookInfo implements Comparable<BookInfo>{
  private String title;
  private String writer;
  private String genre;
  public String getTitle() {
    return this.title;
  }
  public String getWriter() {
    return this.writer;
  }
  public String getGenre() {
    return this.genre;
  }
  public void setTitle(String t) {
    this.title = t;
  }
  public void setWriter(String w) {
    this.writer = w;
  }
  public void setGenre(String g) {
    this.genre = g;
  }
  public int compareTo(BookInfo bi) {
    return title.compareTo(bi.getTitle());
  }
}

class GenreSort implements Comparator<BookInfo> {
  public int compare(BookInfo f, BookInfo s) {
    return f.getGenre().compareTo(s.getGenre());
  }
}
