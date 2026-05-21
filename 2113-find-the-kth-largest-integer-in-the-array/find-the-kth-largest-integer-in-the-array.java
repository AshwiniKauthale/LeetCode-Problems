import java.math.BigInteger; 
class Solution {
    public String kthLargestNumber(String[] nums, int k)
    {
        BigInteger Arr[] = new BigInteger[nums.length]; 

        int i = 0;

        for(i = 0; i < nums.length; i++)
        {
            Arr[i] = new BigInteger(nums[i]); 
        }  

        Arrays.sort(Arr);

        String s = String.valueOf(Arr[Arr.length - k]);

        return s;
          
    }
}