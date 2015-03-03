// A solution using an FPish reduce.

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public final class Taxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer nGroups = Integer.valueOf(sc.nextLine());
        String[] grpInput = sc.nextLine().split(" ");
        ArrayList<Integer> groups = new ArrayList<>();

        for (int i = 0; i < nGroups; i++) {
            Integer z = Integer.valueOf(grpInput[i]);
            groups.add(z);
        }
        
        Collections.sort(groups);
        Collections.reverse(groups);
       
        // Reduce the list
        int i = 0;
        while (i < groups.size()) {
            int j = groups.size() - 1;
            Integer group = groups.get(i);

            while (group <= 4 && i < j && (group + groups.get(j)) <= 4) {
                group += groups.get(j);
                groups.remove(j);
                j--;
            }
            groups.set(i, group);
            i++;
        }
        System.out.println(groups.size());
    }
}
