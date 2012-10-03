public class Zombie {
  private int eyes;
  private boolean brain;
  private WeaponType weapon;
  enum WeaponType{ 
    KNIFE, BAT, HATCHET;
  }

  Zombie() {
    setEyes(2); 
    setBrain(false); 
    setWeapon(WeaponType.KNIFE); 
  }

  Zombie(int e, boolean b, WeaponType w) {
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

  public WeaponType getWeapon() {
    return this.weapon;
  }

  public void setEyes(int e) {
    this.eyes = e;
  }

  public void setBrain(boolean b) {
    this.brain = b;
  }

  public void setWeapon(WeaponType w) {
    this.weapon = w;
  }

  public boolean isBrainless() {
    if(!brain) {
      return true;
    } else {
      return false;
    }
  }
  
}
