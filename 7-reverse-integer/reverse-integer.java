class Solution {
    public int reverse(int x)
    {
        int iDigit = 0;
        long iRev = 0;

        while(x != 0)
        {
            iDigit = x % 10;
            iRev = iRev * 10 + iDigit;
            x = x / 10;
        }

        if(iRev > 2147483647 || iRev < -2147483647)  
        {
            return 0;
        }

        return (int)iRev;
    }
}