class Solution {
    public int maxArea(int[] height)
    {
        int maxcapacity = 0;
        int left = 0; 
        int right = height.length - 1;

        while(left< right)
        {
            int width = right - left;
            int heights = Math.min(height[left],height[right]);
            int capacity = width * heights;

            maxcapacity = Math.max(maxcapacity,capacity);

            if(height[left] > height[right])
            {
                right--;
            }
            else
            {
                left++;
            }
        }
        
        return maxcapacity;
    }
}