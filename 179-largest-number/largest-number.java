class Solution {
    public String largestNumber(int[] nums)
    {
        String Arr[] = new String[nums.length];

        for(int i = 0; i < Arr.length; i++)
        {
            String s = String.valueOf(nums[i]);
            Arr[i] = s;
        }

        Arrays.sort(Arr, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));
        String s = "";

        if (Arr[0].equals("0")) {
            return "0";
        }

        for(int i = 0; i < Arr.length; i++)
        {
            s = s.concat(Arr[i]);
        }

        return s;
    }
}