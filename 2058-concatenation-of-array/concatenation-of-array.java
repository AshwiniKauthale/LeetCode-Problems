class Solution {
    public int[] getConcatenation(int[] nums)
    {
        int n = nums.length;
        int ans[] = new int[2 * n];
        int i = 0;

        for(i = 0; i < nums.length; i++)
        {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }    

       return ans; 
    }
}