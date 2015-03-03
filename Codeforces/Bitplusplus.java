import java.util.Scanner;

public final class Bitplusplus {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = 0;
    int statements = sc.nextInt();
    sc.nextLine();

    for (int i = 0; i < statements; i++) {
      String statement = sc.nextLine();
      if (statement.indexOf("++") != -1) {
        x++;
      } else {
        x--;
      }
    }

    System.out.println(x);
  }
}
