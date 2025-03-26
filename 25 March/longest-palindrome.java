class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        char[] c=s.toCharArray();
        if(c.length==1)
        {
            return 1;
        }
        for(char ch :c)
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int palindromeLength=0;
        boolean hasOdd = false;
        for(int ct:map.values())
        {
            if(ct%2==0)
            {
               palindromeLength+=ct;
            }
           else {
                palindromeLength += ct - 1; 
                hasOdd = true;
            }
        }
         if (hasOdd) {
            palindromeLength += 1;
        }

        return palindromeLength;
    }
}
