class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int sum=0;
        for(int val:map.keySet()){
            if(map.get(val)==1){
                sum += val;
            }
        }
        return sum;
    }
}