import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public final class Reposts {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nReposts = Integer.valueOf(sc.nextLine());
    int longest = 2;
    Hashtable<String, ArrayList<String>> paths = new Hashtable<>();

    for (int i = 0; i < nReposts; i++) {
      String edge = sc.nextLine();
      String source = getSource(edge);
      String reposter = getReposter(edge);
      ArrayList<String> path = paths.get(source);

      if (path == null) {
        ArrayList<String> new_path = new ArrayList<String>() {{
          add(source);
        }};
        paths.put(reposter, new_path);
      } else {
        ArrayList<String> new_path = new ArrayList<String>(path);
        new_path.add(source);
        paths.put(reposter, new_path);
        if (new_path.size() + 1 > longest) {
          longest = new_path.size() + 1;
        }
      }
    }

    System.out.println(longest);
  }
  
  private static String getSource(String repost_path) {
    String[] split_input = repost_path.split(" ");
    return split_input[split_input.length - 1].toLowerCase();
  }

  private static String getReposter(String repost_path) {
    String[] split_input = repost_path.split(" ");
    return split_input[0].toLowerCase();
  }
}
