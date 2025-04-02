class Solution {
    public boolean checkRecord(String s) {
        int countA=0;
        int countL=0;
        int countP=0;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='A') {
                countA++;
                if(countL<3)
                countL=0;
            }
            else if(s.charAt(i)=='L')
            {
                countL++;
            }
            else if(s.charAt(i)=='P')
            {
                countP++;

                 if(countL<3)
                countL=0;
            }
            

        }
        if(countA<2 && countL<3)
        {
            return true;
        }
        return false;
    }
}
