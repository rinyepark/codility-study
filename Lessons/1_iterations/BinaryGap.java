// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // Implement your solution here
        int maxGap = 0;
        int tmpGap = 0;
        int bfrInt = 0;

        // 1. binary + check gap
        while (N > 1) {
            int rest = N % 2;
            N /= 2;

            if (N == 1) {
                tmpGap = rest == 0 && (tmpGap > 0 || (bfrInt == 1 && tmpGap == 0)) ? tmpGap + 1 : tmpGap;
                maxGap = maxGap < tmpGap ? tmpGap : maxGap;
            }
            else if (rest == 1 && tmpGap > 0) {
                maxGap = maxGap < tmpGap ? tmpGap : maxGap;
                tmpGap = 0;
            } else if ((rest == 0 && bfrInt == 1) && tmpGap == 0) {
                tmpGap = 1;
            } else if (rest== 0 && tmpGap > 0) {
                tmpGap += 1;
            }

            bfrInt = rest;
        }
        
        return maxGap;
    }
}