class Solution {
    public int[] singleNumber(int[] nums)
    {
        // List<Integer> list = new ArrayList<>();
        // Map<Integer, Integer> mp = new HashMap<>();

        // for (int i = 0; i < nums.length; i++)
        // {
        //     mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
        // }

        // for (Map.Entry<Integer, Integer> e : mp.entrySet())
        // {
        //     if (e.getValue() == 1)
        //     { 
        //         list.add(e.getKey());
        //     }
        // }

        // int[] Arr = new int[list.size()];
        // for (int i = 0; i < list.size(); i++)
        // {
        //     Arr[i] = list.get(i);
        // }

        // return Arr;

        HashSet<Integer> st = new HashSet<>();

        for(int i = 0; i < nums.length; i++)
        {
            if(st.contains(nums[i]))
            {
                st.remove(nums[i]);
            }
            else
            {
                st.add(nums[i]);
            }
        }

        int Arr[] = new int[st.size()];
        int i = 0;

        for(Integer element : st)
        {
            Arr[i] = element;
            i++;
        }

        return Arr;
    }
}
