class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!=s2.length())
        {
            return false;
        }
         
         char[] s1Array=s1.toCharArray();
         char[] s2Array=s2.toCharArray();
         int count=0;
        for(int i=0;i<s1Array.length;i++)
        {

            if(s1Array[i]!=s2Array[i])
            {
                count++;
            }
        }
        
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        for(int i=0;i<s1Array.length;i++)
        {
            if(s1Array[i]!=s2Array[i])
            {
                return false;
            }
        }
        if(count==2 || count==0)
        {
            return true;
        }
        return false;
    }
}
