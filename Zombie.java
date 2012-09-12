public class Zombie {
  private int eyes;
  private boolean brain;
  private String weapon;

  // Look into using an ArrayList as a configuration parameter
  Zombie(int e, boolean b, String w) {
    setEyes(e);
    setBrain(b);
    setWeapon(w);
  }

  public int getEyes() {
    return this.eyes;
  }

  public boolean getBrain() {
    return this.brain;
  }

  public String getWeapon() {
    return this.weapon;
  }

  public void setEyes(int e) {
    this.eyes = e;
  }

  public void setBrain(boolean b) {
    this.brain = b;
  }

  public void setWeapon(String w) {
    this.weapon = w;
  }

  public boolean isBrainless() {
    if(!brain) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] str) {
    System.out.println("Began the program");
    Zombie z = new Zombie(1, false, "Knife");
    if (z.isBrainless()) {
      System.out.println("The zombie has no brain!!!");
    } else {
      System.out.println("The zombie has a brain!!!");
    }
  }
}
