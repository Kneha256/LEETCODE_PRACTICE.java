class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ar[]=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i !=j && nums[i]+nums[j]==target){
                    ar[0]=i;
                    ar[1]=j;

                }
        }
        }return ar;
}}

