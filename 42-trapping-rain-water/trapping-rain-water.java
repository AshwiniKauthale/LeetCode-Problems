class Solution {
    public int trap(int[] height)
    {
        int n = height.length;
        int i = 0;
        int trapwater = 0;
        int max = 0;
        int lArr[] = new int[n];
        int rArr[] = new int[n];

        max = height[0];
        for(i = 0; i < n; i++) 
        {
            if(height[i] >= max)
            {
                max = height[i];
                lArr[i] = height[i];
            } 
            else
            {
                lArr[i] = max;
            }
        }

        max = height[n - 1];

        for(i = n - 1; i >= 0; i--) 
        {
            if(height[i] >= max)
            {
                max = height[i];
                rArr[i] = height[i];
            } 
            else
            {
                rArr[i] = max;
            }
        }

        for(i = 0; i < n; i++)
        {
            trapwater += (Math.min(lArr[i], rArr[i]) - height[i]);
        }

        return trapwater;
    }
}