//iteration
class Solution {
    public int fib(int n) {
        int a=0;
        int b=1;
        int sum=0;
        if(n==0) return n;
        if(n==1) return 1;
        
        for(int i=2;i<=n;i++){
            sum=a+b;
            a=b;
            b=sum;  
        }return sum; 
        
    }
}



//by recurssion
class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;

        return fib(n-1)+fib(n-2);
        
    }
}
