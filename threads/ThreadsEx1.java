// Extending java.lang.Thread
class MyThread extends Thread{
  public void run() {
    System.out.println("My extended thread is doing its thing");
  }
}
public class ThreadsEx1{
  public static void main(String[] args) {
    Thread aThread = new MyThread();
    aThread.start();
  }
}
