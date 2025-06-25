import java.util.Arrays;
public class occurance {
    public static int[] searchRange(int[] nums, int target) {
        int FirstOccurance=LeftSearch(nums,target);
        int LastOccurance=RightSearch(nums,target);
        return new int[]{FirstOccurance,LastOccurance};
    }
    public static int LeftSearch(int[] nums,int target){
        int result=-1;
        int low=0, high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target==nums[mid]){
                result=mid;
                high=mid-1;
                count++;
            }
            else if(target>nums[mid]) low=mid+1;
            else high=mid-1;
        }return result;

    }
    public static int RightSearch(int[] nums,int target){
        int result=-1;
        int low=0, high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target==nums[mid]){
                result=mid;
                low=mid+1;
            }
            else if(target>nums[mid]) low=mid+1;
            else high=mid-1;
        }return result;

    }
    public static void main(String[] args){
        int[] arr={1,3,4,4,6,7,8,8,8,9,10};
        int target=8;
        System.out.println(Arrays.toString(searchRange(arr,target)));

    }

}

