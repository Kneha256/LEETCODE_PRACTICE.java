class Solution {
    public void sortColors(int[] nums) {
       int n=nums.length;
       int mid=0;
       int low=0;
       int high=n-1;
       while(mid<=high){
        if(nums[mid]==0){
            swap(nums, mid, low);
            low++;
            mid++;
            }
        else if(nums[mid]==1){
            mid++;
        }
        else if(nums[mid]==2){
            swap(nums, mid, high);
            high--;
        }
       }
    }
    public void swap(int[] nums, int start, int end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
    }
}
