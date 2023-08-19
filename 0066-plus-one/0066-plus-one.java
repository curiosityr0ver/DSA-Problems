class Solution {
    public int[] plusOne(int[] digits) {
        
        
        int carry = 1;
        
        for(int i = digits.length-1; i >= 0; i--) {
            digits[i] += carry;
            
            carry = digits[i]/10;
            digits[i] = digits[i] % 10;
        }
        
        if(carry > 0) {
            int [] res = new int [digits.length + 1];
            res[0] = carry;
            for(int i = 0; i < digits.length; i++) {
                res[i+1] = digits[i];
            }
            digits = res;
        }
        
        System.out.println(carry);
        
        return digits;
    }
    
}