public class Ex{
  public static void main (String [] args)
  {
    Parent p = new Parent();
    // Constructors are not inherited.  This will fail
    //Child c = new Child("String");
    Child c = new Child();
  }
}
class Parent {
  Parent() {

  }
  Parent(String str) {

  }
}
class Child {
  Child() {

  }
}
