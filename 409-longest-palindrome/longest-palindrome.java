class Solution {
    public int longestPalindrome(String s) {
        Map <Character,Integer> map =new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int sum =0;
        boolean isOdd=false;
        for(int e:map.values()){
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