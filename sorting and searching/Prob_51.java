//Implement binary search.(Using Recursion)

class Solution {

    public int bs(int lb, int ub, int[] nums, int target){
        if(lb>ub){
            return -1;
        }

        int mid=(lb+ub)/2;

        if(nums[mid]==target){
            return mid;
        }else if(nums[mid]>target){
            return bs(lb,mid-1,nums,target);
        }else{
            return bs(lb+1,ub,nums,target);
        }
    }

    public int search(int[] nums, int target) {
        return bs(0,nums.length-1,nums,target);
    }
}