class Solution {
    public int addDigits(int num) {
        int n=0;
        while(num>9){
            n=num;
            num=0;
            while(n>0){
                num+=(n%10);
                n/=10;
            }
        }
        return num;
    }
}