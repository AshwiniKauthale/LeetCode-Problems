class Solution {
    public int getSum(int a, int b)
    {
        if (b == 0) {
            return a;
        }
        // XOR gives the sum without carry
        // AND shifted left gives the carry
        return getSum(a ^ b, (a & b) << 1);
    }
}