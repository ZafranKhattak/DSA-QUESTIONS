class Solution 
{
    public int maxSubArray(int[] nums) 
    {
        int maxSum = nums[0];
        int currentSum = nums[0];
        
        for (int i = 1; i < nums.length; i++) 
        {
            if (currentSum + nums[i] > nums[i]) {
                currentSum = currentSum + nums[i];  
            } else {
                currentSum = nums[i];               
            }
            //update condition
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        
        return maxSum;
    }
}

class Main
{
    public static void main(String[] args) {
        
        int [] nums = {-2,1,4,5};

        Solution sol = new Solution();

        System.out.print(sol.maxSubArray(nums));
    }
}