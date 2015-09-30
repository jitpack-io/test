package hello;

public class Hello {
  private String greeting = "Hello world!";
  
  public static void main(String[] args) {
   new Hello().greet();
  }
  
  public void greet() {
     System.out.println("Greeting: " + greeting);
  }
}

