class Solution {
    public int numberOfSubstrings(String s) {
        
    int count=0;

    int[] arr=new int[3];

    int j=0;

    for(int i=0;i<s.length();i++){

        if(arr[0]>0&&arr[1]>0&&arr[2]>0){

        arr[s.charAt(i) - 'a']--;
        count+=(s.length()-j+1);
        continue;

    }

        if(j==s.length())break;

        while(j<s.length()&&(arr[0]==0||arr[1]==0||arr[2]==0)){

            arr[s.charAt(j) - 'a']++;


            j++;

        }

        if(arr[0]>0&&arr[1]>0&&arr[2]>0)
        count+=(s.length()-j+1);

        arr[s.charAt(i) - 'a']--;


    }


    return count;


    }
}