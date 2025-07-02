import java.util.Scanner;

public class P3 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String n = s.nextLine();
    String y = s.nextLine();

    System.out.println("Member Name: " + n);
    System.out.println("Selected Membership: " + y);
    s.close();
  }
}
