class Solution {
    public int removeDuplicates(int[] nums)
    {
        List<Integer> list = new ArrayList<>();

        int i = 0;
        int iCount = 0;

        list.add(nums[0]);

        for(i = 1; i < nums.length; i++)
        {
            if(nums[i - 1] != nums[i])
            list.add(nums[i]);
        }

        i = 0;
        for(int n : list)
        {
            nums[i] = n;
            i++;
        }
        
        iCount = nums.length - list.size();
        iCount = nums.length - iCount;
        return iCount;
    }
}