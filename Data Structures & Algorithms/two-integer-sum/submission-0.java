class Solution {
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer,Integer> ht = new Hashtable<>();
        for(int i=0;i<nums.length;i++){
            if(ht.containsKey(nums[i])){
                return new int[]{ht.get(nums[i]),i};
            }
            ht.put(target - nums[i],i);
        }
        return new int[]{};
    }
}
