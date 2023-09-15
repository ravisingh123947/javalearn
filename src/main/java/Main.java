
import java.util.*;

public class Main {

    public static int minPalindromicCut(String s) {
        //write your code here
        int minimum_partition = -1;

        boolean[][] dp1 = new boolean[s.length()][s.length()];

        for (int g = 0; g < s.length(); g++) {
            for (int i = 0, j = g; j < dp1.length; i++, j++) {
                if (g == 0) {
                    dp1[i][j] = true;
                } else if (g == 1) {
                    dp1[i][j] = s.charAt(i) == s.charAt(j);
                } else {
                    if (s.charAt(i) == s.charAt(j) && dp1[i + 1][j - 1] == true) {
                        dp1[i][j] = true;
                    } else {
                        dp1[i][j] = false;
                    }
                }
            }

        }
        int[][] dp2 = new int[s.length()][s.length()];
        for (int g = 0; g < s.length(); g++) {
            for (int i = 0, j = g; j < dp2.length; i++, j++) {
                if (g == 0) {
                    dp2[i][j] = 0;
                } else if (g == 1) {
                    if (s.charAt(i) == s.charAt(j)) {
                        dp2[i][j] = 0;
                    } else {
                        dp2[i][j] = 1;
                    }
                } else {
                    if (dp1[i][j] == true) {
                        dp2[i][j] = 0;
                    } else {
                        int min = Integer.MAX_VALUE;
                        for (int k = i; k < j; k++) {
                            int left = dp2[i][k];
                            int right = dp2[k + 1][j];
                            if (min > left + right + 1) {
                                min = left + right + 1;
                            }

                        }
                        dp2[i][j] = min;
                    }
                }
            }
        }
        minimum_partition = dp2[0][s.length() - 1];
        return minimum_partition;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(minPalindromicCut(str));
    }
}