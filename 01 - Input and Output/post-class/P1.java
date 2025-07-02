import java.util.Scanner;

public class P1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String n = s.nextLine();
    int a = s.nextInt();
    float c = s.nextFloat();
    s.nextLine();
    char g = s.nextLine().charAt(0);

    float t = (int) (c * 100) / 100.0f;

    System.out.println("Name: " + n);
    System.out.println("Age: " + a);
    System.out.printf("CGPA: %.2f\n", t);
    System.out.println("Grade: " + g);
    s.close();
  }
}
