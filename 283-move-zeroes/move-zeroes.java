class Solution {
    public void moveZeroes(int[] nums)
    {
        int i = 0;
        int j = 0;
        int temp = 0;
        for(i = 0; i < nums.length; i++)
        {
            for(j = i; j < nums.length; j++)
            {
                if(nums[i] == 0)
                {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                else
                {
                    break;
                }
            }  
        }    
    }
}