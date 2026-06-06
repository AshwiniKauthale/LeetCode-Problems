class Solution {
    public int fib(int n)
    {
        if(n < 0 || n > 30)
        {
            return -1;
        }  

        int Arr[] = new int[31];

        Arr[0] = 0;
        Arr[1] = 1;

        for(int i = 2; i < 31; i++)
        {
            Arr[i] = Arr[i - 2] + Arr[i - 1];
        }  

        return Arr[n];
    }
}