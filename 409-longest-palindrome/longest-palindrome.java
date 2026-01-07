class Solution {
    public int longestPalindrome(String s) {
      
        int []freq =new int[128];
        for(char ch:s.toCharArray()){
            freq[ch]++;
        }



        int sum =0;
        boolean isOdd=false;
        for(int e:freq){
            if(e%2==0){
                sum += e; 
            }else{
                isOdd=true;
                sum += (e-1);
            }
        }


        return isOdd?sum+1:sum;
    }
}