class Solution {
    public int trap(int[] height) {
        //to calculate left max boundary
        int leftmax[]=new int[height.length];
        leftmax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        //to calculate right max boundary
        int rightmax[]=new int[height.length];
        rightmax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        //loop
        int trappedwater=0;
        for(int i=0;i<height.length;i++){
            //waterlevel=min(left max,rigth max)
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            //trapped water=(waterlevel-heigth)
            trappedwater+=waterlevel-height[i];
        }return trappedwater;
        
        
        
    }
}
