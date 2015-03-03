import java.util.Scanner;

final public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int nProblems = Integer.valueOf(sc.nextLine());

        int nAgree = 0;

        for (int i = 0; i < nProblems; i++) {
            String pattern = sc.nextLine().replaceAll("\\s", "");
            int value = Integer.parseInt(pattern, 2);

            if (value == 6 || value == 5 || value == 3 || value == 7) {
                nAgree++;
            }
        }

        System.out.println(nAgree);
    }
}
