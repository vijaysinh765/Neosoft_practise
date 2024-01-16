package dailyAssignments;


public class SixteenJanTwentyTwentyFour {
// to find missing number in a given series of numbers in an array
    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 0, 1};
        System.out.println("missing number in a given array having number series nums1 :"+findMissingNumber(nums1)); // Output: 2

        int[] nums2 = {0, 1};
        System.out.println("missing number in a given array having number series nums2 :"+findMissingNumber(nums2)); // Output: 2

        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println("missing number in a given array having number series nums3 :"+findMissingNumber(nums3)); // Output: 8
    }
}