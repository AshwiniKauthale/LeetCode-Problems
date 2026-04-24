class Solution {
    public boolean isPalindrome(int x)
    {
        if(x < 0)
        {
            return false;
        }
        int iDigit = 0;
        int iRev = 0;
        int temp = x;

        while(x != 0)
        {
            iDigit = x % 10;
            iRev = iRev * 10 +iDigit;
            x = x / 10;
        }

        if(temp == iRev)
        {
            return true;
        }
        else 
        {
            return false;
        }

    }
}