// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // Implement your solution here
        Set<Integer> set = new HashSet<>();

        for (int a : A) {
            if (set.contains(a)) {
                set.remove(a);
            } else {
                set.add(a);
            }
        }

        List<Integer> list = new ArrayList<>(set);
        return list.get(0);

    }
}