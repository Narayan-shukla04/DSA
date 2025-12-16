class Solution {
    public int[] numberOfPairs(int[] nums) {
       Map <Integer ,Integer> map =new HashMap<>();
       for (int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
    }
       int pairs=0;
       int leftovers=0;
       for(int val : map.values()){
        pairs += val/2;
        leftovers += val%2; 
       } 
    return new int[]{pairs ,leftovers};
    }
    
}