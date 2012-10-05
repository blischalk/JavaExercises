class Test {
  void f(){
    throw new RuntimeException();
  }
}
public class ExceptionEx1{
  public static void main(String[] str) throws Exception
  {
    System.out.println("In main");
    Test t = new Test();
    try
    {
      System.out.println("In try");
      t.f();
    }
    catch (Throwable e)
    {
      System.out.println("In first catch");
      try
      {
        System.out.println("In second try");
        throw new Exception();
      }
      catch(Exception ex)
      {
        System.out.println("In second catch");
        System.out.print("catch1");
        throw ex;
      }
      finally
      {
        System.out.println("In first finally");
        System.out.print("finally1");
      }
    }
    finally
    {
      System.out.println("In second finally");
      System.out.print("finally2");
    }
  }
}
