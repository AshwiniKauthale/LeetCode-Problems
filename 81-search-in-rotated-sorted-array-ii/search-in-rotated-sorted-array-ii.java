class Solution {
    public boolean search(int[] nums, int target)
    {
        int i = 0;
        Boolean bFlag = false;

        for(i = 0; i < nums.length; i++)
        {
            if(nums[i] == target)
            {
                bFlag = true;
                break;
            }
        } 

        return bFlag;   
    }
}