package hello;

public class Hello {
  
  private static String GREETING = "Hello";
  
  public static void main(String[] args) {
   new Hello().greet(args[0]);
  }
  
  public void greet(String name) {
     System.out.println(GREETING + " " + name);
  }
}

