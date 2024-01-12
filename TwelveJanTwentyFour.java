package dailyAssignments;


public class TwelveJanTwentyFour {

    public static int hammingWeight(String binaryString) {
        
        if (binaryString.length() != 32) {
            throw new IllegalArgumentException("Input must be a binary string of length 32");}
        
         int count = 0;
         for (char character : binaryString.toCharArray()) {
            if (character == '1') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String binary1 = "00000000000000000000000000001011";
        System.out.println("number of '1'bits in given string binary1 is : "+hammingWeight(binary1)); // Output: 3

        String binary2 = "00000000000000000000000010000000";
        System.out.println("number of '1'bits in given string binary2 is : "+hammingWeight(binary2)); // Output: 1

        String binary3 = "11111111111111111111111111111101";
        System.out.println("number of '1'bits in given string binary3 is : "+hammingWeight(binary3)); // Output: 31
    }
}