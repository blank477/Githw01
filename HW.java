import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   
    
    Scanner keyboard = new Scanner(System.in);
    System.out.println(" Please enter your name: ");

    String message = keyboard.nextLine();
    
    System.out.println("Hello: " + message);
  }
}