package logical;


	
	import java.util.HashMap;
	import java.util.Map;

	public class FindPairsWithSum {
	    public static void main(String[] args) {
	        int[] array = {2, 4, 3, 5, 7, 8, 9};
	        int targetSum = 7;

	        findPairsWithSum(array, targetSum);
	    }

	    public static void findPairsWithSum(int[] array, int targetSum) {
	        Map<Integer, Integer> map = new HashMap<>();

	        for (int num : array) {
	            int complement = targetSum - num;

	            if (map.containsKey(complement)) {
	                System.out.println("Pair: " + num + ", " + complement);
	            }

	            map.put(num, 1);
	        }
	    }
	}



