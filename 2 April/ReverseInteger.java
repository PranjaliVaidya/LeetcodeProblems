class Solution {
    public int reverse(int x) {
        boolean isNegative=false;
        if(x<0)
        {
            isNegative=true;
            x=-x;
        }
        int res=0;
        while(x>0)
        {
            int rem=x%10;
             if (res > (Integer.MAX_VALUE - rem) / 10) {
                return 0;
            }
            res=res*10+rem;
            x/=10;
        }

        if(isNegative)
        {
            return -res;
        }
        return res;
    }
}
