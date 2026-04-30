class Solution {
    public String reversePrefix(String word, char ch)
    {
        Boolean bFlag = true;
        int index = 0;
        int i = 0;

        for(i = 0; i < word.length(); i++)
        {
            if(word.charAt(i) == ch)
            {
                index = i;
                bFlag = false;
                break;
            }
        }  

        if(bFlag != false)
        {
            return word;
        }  

        String reversed = new StringBuilder(word.substring(0,index + 1)).reverse().toString();

        reversed = reversed + word.substring(index + 1, word.length());

        return reversed;
    }
}