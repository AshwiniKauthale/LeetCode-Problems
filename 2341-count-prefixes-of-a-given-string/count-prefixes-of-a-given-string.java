class Solution {
    public int countPrefixes(String[] words, String s)
    {
        int i = 0; 
        int count = 0;  

        for(i = 0; i < words.length; i++)
        {
            if(s.startsWith(words[i]))
            {
                count++;
            }
        }  

        return count;
    }
}