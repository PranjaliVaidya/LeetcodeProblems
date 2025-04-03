/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int s=0;
        int e=n;
        int mid=0;
        while(s<e)
        {
            mid=s+(e-s)/2;
            // if(isBadVersion(mid))
            // {
            //     e=mid;
            // }
            // else if(isBadVersion(mid)==false ) {
            //     s=mid+1;
                
            // }

            if(isBadVersion(mid)==true && isBadVersion(mid-1)==false)
            {
                return mid;
            }
            else if(isBadVersion(mid))
            {
                e=mid;
            }else
            {
                s=mid+1;
            }
        }
        return s;
    }
}
