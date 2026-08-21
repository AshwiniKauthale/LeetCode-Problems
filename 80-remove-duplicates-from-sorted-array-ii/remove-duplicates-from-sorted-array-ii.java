class Solution {
    public int removeDuplicates(int[] nums)
    {
        int i = 0;
        int iCount = 0;

        List<Integer> list = new ArrayList<>();

        if(nums.length <= 2)
        {
            return nums.length;
        }


        list.add(nums[0]);
        list.add(nums[1]);

        for(i = 2; i < nums.length; i++)
        {
            if(nums[i - 2] != nums[i])
            {
                list.add(nums[i]);
            }
        } 

        for(i = 0; i < list.size(); i++)
        {
            nums[i] = list.get(i);
        }

        // iCount = nums.length - list.size();

        // iCount = nums.length - iCount;

        return list.size();
    }
}