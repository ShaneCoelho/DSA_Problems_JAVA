
class MinInRotatedArr {
    public int findMin(int[] nums) {
        int n=nums.length;
        int l=0;
        int h=n-1;
        int min=Integer.MAX_VALUE;

        if(nums[l]<=nums[h]){
            return nums[l];
        }

        while(l<=h){
            int mid=(l+h)/2;

            if(nums[l]<=nums[mid]){
                min=Math.min(min,nums[l]);
                l=mid+1;
            }
            else{
                min=Math.min(min,nums[mid]);
                h=mid-1;
            }
        }
        return min;
    }
}