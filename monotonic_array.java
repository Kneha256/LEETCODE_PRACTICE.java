class Solution {
    public boolean isMonotonic(int[] nums) {
     boolean flag=true;
     for(int i=1;i<nums.length;i++){
        if(nums[i]<nums[i-1]){
            flag=false;
            break;
        }
     }if(flag==true){
        return flag;
     }else{
        flag=true;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                flag=false;
                break;
            }
        }
     }  return flag;
    }
}
