package hello;

public class Hello {
  
  private static String GREETING = "Hello there";
  
  public static void main(String[] args) {
   new Hello().greet(args[0], 5);
  }
  
  public void greet(String name, int times) {
     for(int i = 0; i < times; i++)
      System.out.println(GREETING + " " + name);
  }
  
  @Override
  public String toString() {
    return GREETING;
  }
}

