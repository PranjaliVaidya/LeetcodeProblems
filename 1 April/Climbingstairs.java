class Solution {
    public int climbStairs(int n) {
        if(n==0 || n==1)
        {
            return 1;
        }

        //return climbStairs(n-1)+climbStairs(n-2);
        int a=1;
        int b=1;
        int temp=0;
        for(int i=2;i<=n;i++)
        {
            temp =a+b;
            a=b;
            b=temp;

        }
        return temp;
    }
}
