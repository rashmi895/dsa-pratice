public class maxisubarray {
    public int maxiSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;  // Stores the maximum subarray sum
        int currentSum = 0;  // Tracks the sum of the current subarray

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];  // Add the current element to currentSum
            
            if (currentSum > maxSum) {
                maxSum = currentSum;  // Update maxSum if currentSum is greater
            }

            if (currentSum < 0) {
                currentSum = 0;  // Reset currentSum to 0 if it goes negative
            }
        }
        
        return  maxSum;
       }

}
