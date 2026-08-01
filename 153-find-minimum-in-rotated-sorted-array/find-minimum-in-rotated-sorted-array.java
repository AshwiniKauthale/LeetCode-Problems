class Solution {
    public int findMin(int[] nums)
    {
        int i = 0;
        int Min = nums[0];

        for(i = 1; i < nums.length; i++)
        {
            if(nums[i] < Min)
            {
                Min = nums[i];
            }
        }  

        return Min;  
    }
}