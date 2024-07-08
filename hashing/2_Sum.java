//2 Sum problem LeetCode

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int data;
        for(int i=0;i<nums.length;i++){
            data=target-nums[i];
            if(map.containsKey(data)){
                int[] result = {map.get(data),i};
                return result;
            }
            map.put(nums[i],i);
        }
        int[] result = {-1,-1};
        return result;
    }
}