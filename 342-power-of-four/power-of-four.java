class Solution {
    public boolean isPowerOfFour(int n)
    {
        int i = 0;
        Boolean bFlag = false;

        if(n == 1 || n == 4 || n == 16 || n == 64 || n == 256 || n == 1024)
        {
            return true;
        }

        for(i = 0; i < n /256; i++)
        {
            if((Math.pow(4,i)) == n)
            {
                bFlag = true;
                break;
            }
        }

        return bFlag;    
    }
}