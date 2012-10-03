public class ZombieLand {
  public static void main(String[] str) {
    System.out.println("Began the program");
    Zombie z = new Zombie(1, false, Zombie.WeaponType.BAT);
    if (z.isBrainless()) {
      System.out.println("The zombie has no brain!!!");
    } else {
      System.out.println("The zombie has a brain!!!");
    }
    System.out.println("The zombie is carrying a " + z.getWeapon());
    System.out.println("The zombie has " + z.getEyes() + " eye(s)");
  }
}
