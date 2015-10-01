package hello;

public class Hello {
  
  private static String GREETING = "Hello there";
  
  public static void main(String[] args) {
   new Hello().greet(args[0]);
  }
  
  public void greet(String name) {
     System.out.println(GREETING + " " + name);
  }
  
  @Override
  public String toString() {
    return GREETING;
  }
}

