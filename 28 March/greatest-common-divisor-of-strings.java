class Solution {
    public int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }

        return gcd(b,a%b);
    }
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1))
        {
            return "";
        }

        return str2.substring(0,gcd(str1.length(),str2.length()));
    }
}
