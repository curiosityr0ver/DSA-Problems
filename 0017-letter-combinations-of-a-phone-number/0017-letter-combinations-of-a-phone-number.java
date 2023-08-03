class Solution {
    List<String> res = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return res;
        helper("", 0, digits);
        
        return res;
    }
    
    void helper(String str, int index, String digits) {
        if(index == digits.length()) res.add(str);
        else {
            index++;
            switch(digits.charAt(index-1)) {
              case '2':
                helper(str + "a", index, digits);
                helper(str + "b", index, digits);
                helper(str + "c", index, digits);
                return;
              case '3':
                helper(str + "d", index, digits);
                helper(str + "e", index, digits);
                helper(str + "f", index, digits);
                return;
             case '4':
                helper(str + "g", index, digits);
                helper(str + "h", index, digits);
                helper(str + "i", index, digits);
                return; 
            case '5':
                helper(str + "j", index, digits);
                helper(str + "k", index, digits);
                helper(str + "l", index, digits);
                return; 
            case '6':
                helper(str + "m", index, digits);
                helper(str + "n", index, digits);
                helper(str + "o", index, digits);
                return; 
            case '7':
                helper(str + "p", index, digits);
                helper(str + "q", index, digits);
                helper(str + "r", index, digits);
                helper(str + "s", index, digits);
                return; 
            case '8':
                helper(str + "t", index, digits);
                helper(str + "u", index, digits);
                helper(str + "v", index, digits);
                return; 
            case '9':
                helper(str + "w", index, digits);
                helper(str + "x", index, digits);
                helper(str + "y", index, digits);
                helper(str + "z", index, digits);
                return; 
            }
        }
    }
}