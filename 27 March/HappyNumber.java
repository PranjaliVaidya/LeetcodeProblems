class Solution {
    public int square(int n)
    {
        int sq=0;
        while(n>0)
        {
            int rem=n%10;
            sq+=rem*rem;
            n/=10;
        }
        return sq;
    }
    public boolean isHappy(int n) {
        int fast=n;
        int slow=n;

       do
        {
            fast=square(square(fast));
            slow=square(slow);

        } while(fast!=slow);
        return slow==1;
    }
}
