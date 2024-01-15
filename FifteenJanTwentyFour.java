package dailyAssignments;

import java.util.Arrays;

public class FifteenJanTwentyFour {

    public static int[] countBits(int n) {
        int[] ans = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            // Use the property ans[i] = ans[i / 2] + (i % 2)
            ans[i] = ans[i >> 1] + (i & 1);
        }

        return ans;
    }

    public static void main(String[] args) {
        int n1 = 2;
        int[] result1 = countBits(n1);
        System.out.println(Arrays.toString(result1)); // Output: [0, 1, 1]

        int n2 = 5;
        int[] result2 = countBits(n2);
        System.out.println(Arrays.toString(result2)); // Output: [0, 1, 1, 2, 1, 2]
    }
}