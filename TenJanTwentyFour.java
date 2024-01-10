package dailyAssignments;


import java.util.Arrays;

public class TenJanTwentyFour {
	
	// To find longest increasing subsequence(lis)
    public static void main(String[] args) {
        int[] nums1 = {10, 9, 2, 5, 3, 7, 101, 18};
        int[] nums2 = {0, 1, 0, 3, 2, 3};
        int[] nums3 = {7, 7, 7, 7, 7, 7, 7};

        System.out.println("longest increasing subsequence in nums1  : "+lengthOfLIS(nums1)); // Output: 4
        System.out.println("longest increasing subsequence in nums2  : "+lengthOfLIS(nums2)); // Output: 4
        System.out.println("longest increasing subsequence in nums3  : "+lengthOfLIS(nums3)); // Output: 1
    }

    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;

        if (n == 0) { return 0;}
        
        int[] arrayofn = new int[n];
        Arrays.fill(arrayofn, 1);

        return Arrays.stream(arrayofn) .boxed().mapToInt(Integer::intValue).max() .getAsInt();
                
                
               
    }
}