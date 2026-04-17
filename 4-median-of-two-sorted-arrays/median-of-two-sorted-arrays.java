class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        double iRet = 0.0;

        List <Integer> list = new ArrayList<>();

        for(int i = 0; i < nums1.length; i++)
        {
            list.add(nums1[i]);
        }

        for(int i = 0; i < nums2.length; i++)
        {
            list.add(nums2[i]);
        }   

        Collections.sort(list);

        if(list.size() % 2 == 1)
        {
            iRet = list.get(list.size() / 2);

            return iRet; 
        }

        int n = (list.size() / 2 - 1);
        int m = n + 1;

        double k = list.get(n) + list.get(m);


        iRet = k / 2;

        return iRet;
    }
}