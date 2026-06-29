class Solution
{
    public int []traversal (int [] nums)
    {
        for (int i=0; i<nums.length; i++)
        {
            System.out.print(nums[i] + " ");
        }

        return nums;
    }
}

class Main 
{
    public static void main(String[] args) {
        
        Solution sol = new Solution();

        int [] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        System.out.print(sol.traversal(nums));
    }
}