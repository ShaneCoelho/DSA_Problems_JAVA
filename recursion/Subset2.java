
class Solution {

    public static void subset(int index,int[] nums, List<Integer> ds, List<List<Integer>> ans){
        ans.add(new ArrayList<>(ds));
        for(int i=index;i<nums.length;i++){
            if(i!=index && nums[i]==nums[i-1]){
                continue;
            }
            ds.add(nums[i]);
            subset(i+1,nums,ds,ans);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> Subset2(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        subset(0,nums,new ArrayList<>(),ans);
        return ans;
    }
}