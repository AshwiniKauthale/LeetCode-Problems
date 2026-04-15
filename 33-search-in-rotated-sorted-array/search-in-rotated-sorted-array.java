class Solution {
    public int search(int[] nums, int target) 
    {
        int i = 0;
        int iRet = -1;

        for(i = 0; i < nums.length; i++)
        {
            if(nums[i] == target)
            {
                iRet = i;
                break;
            }
        } 

        return iRet;   
    }
}