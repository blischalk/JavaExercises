// Utilize the getName method of the current thread returned by the static currentThread method of the Thread class
class MyRunnable implements Runnable{
  public void run() {
    for(int x = 1; x < 4; x++) {
      System.out.println(Thread.currentThread().getName());
      try {
        Thread.sleep(1000);
      } catch (InterruptedException ex) {}
    }
  }
}

public class ThreadsEx4{
  public static void main(String[] args) {
    Runnable r = new MyRunnable();
    Thread t1 = new Thread(r, "name of thread 1");
    Thread t2 = new Thread(r, "name of thread 2");
    t1.start();
    t2.start();
  }
}
