//solution1-using sum method
class Solution {
    public int missingNumber(int[] nums) {
       int N=nums.length;
       int sumofN=N*(N+1)/2;
       int numsSum=0;
       for(int i=0;i<nums.length;i++){
        numsSum+=nums[i];
       }return sumofN-numsSum;
}
}

//using XOR method
class Solution {
    public int missingNumber(int[] nums) {
       int res=nums.length;
       for(int i=0;i<nums.length;i++){
        res+=i-nums[i];
       }return res;
}
}
