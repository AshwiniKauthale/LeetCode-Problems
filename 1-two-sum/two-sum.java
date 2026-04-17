class Solution {
    public int[] twoSum(int[] nums, int target) {

        int i = 0;
        int j = 0;
        int x = 0, y = 0;

        for(i = 0; i < nums.length; i++)
        {
            for(j = 0; j < nums.length - 1; j++)
            {
                if(nums[i] == target - nums[j])
                {
                    x = i;
                    y = j;  
                    break; 
                }
            }
        }

        return new int[] {x,y};
        
    }
}