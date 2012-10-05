// Implementing java.lang.Runnable
class MyRunnable implements Runnable{
  public void run() {
    System.out.println("My runnable thread is doing its thing");
  }
}

public class ThreadsEx2{
  public static void main(String[] args) {
    Runnable r = new MyRunnable();
    Thread t1 = new Thread(r);
    Thread t2 = new Thread(r);
    t1.start();
    t2.start();
  }
}
