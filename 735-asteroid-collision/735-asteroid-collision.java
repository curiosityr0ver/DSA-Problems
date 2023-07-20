class Solution {
    public int[] asteroidCollision(int[] arr) {
        
        Stack<Integer> stk = new Stack<>();
        int i = 0;

        while(i < arr.length) {
            if(!stk.isEmpty() && (arr[i] < 0 && stk.peek() > 0)) {

                if(Math.abs(arr[i]) > Math.abs(stk.peek())) stk.pop();
                else if(Math.abs(arr[i]) == Math.abs(stk.peek())) {
                    stk.pop();
                    i++;
                } else i++;
    
            } 
            else {
                stk.push(arr[i++]);
            }
        }
        
        
        int [] res = new int[stk.size()];
        i = 0;
        
        for(int ele: stk) {
            res[i++] = ele;
        }

        
        return res;
    } 
}