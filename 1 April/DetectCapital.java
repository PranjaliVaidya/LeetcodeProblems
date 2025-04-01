class Solution {
    public boolean detectCapitalUse(String word) {
        int len=word.length();
        if(word.charAt(0)<'a')
        {
            int countCap=0;
            for(int i=0;i<len;i++)
            {
                if(word.charAt(i)<'a')
                {
                    countCap++;
                }
            }
            if(countCap>1 && countCap<len)
            {
                return false;
            }
        }
        else{
            for(int i=0;i<len;i++)
            {
                if(word.charAt(i)<'a')
                {
                    return false;
                }
            }
        }
        return true;
    }
}
