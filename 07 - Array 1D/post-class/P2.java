import java.util.Scanner;

public class P2 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    s.nextLine();
    String n = s.nextLine();
    System.out.println("User Details:\nName: "+n+"\nAge: "+a);
    s.close();
  }
}
