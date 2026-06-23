class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> num = new HashSet<>();
        if(nums.length==0)return false;
        num.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(num.contains(nums[i])){
                return true;
            }
            num.add(nums[i]);
        }
    return false;
    }
}