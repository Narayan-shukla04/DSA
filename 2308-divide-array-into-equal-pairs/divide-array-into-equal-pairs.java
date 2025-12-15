class Solution {
    //01
    public boolean divideArray(int[] nums) {
      int []freq=new int[501];
      for(int i=0;i<nums.length;i++){
        freq[nums[i]]++;
      }  
      for(int val:freq){
        if(val % 2 != 0){return false;}
      }
      return true;
    }
}