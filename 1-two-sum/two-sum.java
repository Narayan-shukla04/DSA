class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int flag=target -nums[i];
            if(map.containsKey(flag)){
                return new int[]{map.get(flag),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}