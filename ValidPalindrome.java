public class ValidPalindrome{
    public static boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }return true;
        
    }
    public static void main(String[] args){
        String s="A man, a plan, a canal: Panama";
        //ValidPalindrome vp = new ValidPalindrome();
        System.out.println(isPalindrome(s));  
    }
}
    

