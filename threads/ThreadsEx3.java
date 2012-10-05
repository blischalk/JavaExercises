// Utilize the getName method of the current thread returned by the static currentThread method of the Thread class
class MyRunnable implements Runnable{
  public void run() {
    System.out.println(Thread.currentThread().getName());
  }
}

public class ThreadsEx3{
  public static void main(String[] args) {
    Runnable r = new MyRunnable();
    Thread t1 = new Thread(r, "name of thread 1");
    Thread t2 = new Thread(r, "name of thread 2");
    t1.start();
    t2.start();
  }
}
