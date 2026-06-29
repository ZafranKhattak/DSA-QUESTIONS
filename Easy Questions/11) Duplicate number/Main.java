class Solution
{
    public boolean containsDuplicate(int[] nums)
    {
         for (int i=0; i<nums.length-1; i++)
        {
            for (int j=i+1; j<nums.length; j++)
            {
                if (nums[i] - nums[j] == 0) {
                     System.out.println("Duplicate is: " + nums[i]);
                     return true;
                }
            }
        }
        return false;
        
    }
}

class Main 
{
    public static void main(String[] args) {
        
        int[] nums = {1, 3, 4, 5, 2};

        Solution sol = new Solution();

        System.out.print(sol.containsDuplicate(nums));


    }
}