public class RaceCondition implements Runnable{
  private Account acct = new Account();
  public static void main(String[] args) {
    RaceCondition r = new RaceCondition();
    Thread one = new Thread(r);
    Thread two = new Thread(r);
    one.setName("Fred");
    two.setName("Lucy");
    one.start();
    two.start();
  }
  public void run() {
    for (int x = 0; x < 5; x++) {
      makeWithdrawl(10);
      if (acct.getBalance() < 0) {
        System.out.println("Account is overdrawn");
      }
    }
  }
  private void makeWithdrawl(int amt) {
    if (acct.getBalance() >= amt) {
      System.out.println(Thread.currentThread().getName() + " is going to withdraw");
      try {
        Thread.sleep(500);
      } catch (InterruptedException ex) { }
      acct.withdraw(amt);
      System.out.println(Thread.currentThread().getName() + " completes withdraw");
    } else {
      System.out.println(Thread.currentThread().getName() + " can't withdraw.  Not enough in account. " + acct.getBalance());
    }
  }

}

class Account{
  private int balance = 50;
  public int getBalance() {
    return balance;
  }
  public void withdraw(int amount) {
    balance = balance - amount;
  }
}


