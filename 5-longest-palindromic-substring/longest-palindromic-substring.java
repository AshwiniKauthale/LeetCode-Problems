class Solution {
    public Boolean isPalindrome(String str)
    {
        Boolean bFlag = true;

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                bFlag = false;
                break;
            }

            i++;
            j--;
        }

        return bFlag;
    }

    public String longestPalindrome(String s)
    {
        String Longest = "";
        String str = "";
        Boolean bFlag = false;

        int i = 0;
        int j = 0;
        int n = 0;

        for (i = 0; i < s.length(); i++) {
            str = "";
            n = 0;
            for (j = i; j < s.length(); j++) {
                str = s.substring(i, j + 1);

                n = str.length();

                if (n > Longest.length()) {
                    bFlag = isPalindrome(str);

                    if (bFlag == true) {
                        Longest = str;
                    }
                }
            }
        }

        return Longest;   
    }
}