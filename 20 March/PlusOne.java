class Solution {
    public int[] plusOne(int[] digits) {
        int s=0;
        int e=digits.length-1;
         
        for(int i=e;i>=0;i--){
            if(digits[i]!=9)
            {
              digits[i]+=1;
              return digits;
            }
            digits[i]=0;
         }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;  
    }
}
