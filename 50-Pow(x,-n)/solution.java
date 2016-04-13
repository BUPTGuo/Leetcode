public class Solution {
    public double myPow(double x, int n) {
        if(n>=0){
            return helper(x,n);
        }
        else{
            return 1/helper(x,-n);
        }
    }
    public double helper(double x,int n){
        if(n==0) return 1;
        if(n==1) return x;
        if(n==2) return x*x;
        double sum=x;
        int pow=1;
        if(n%2 ==0 ){
            sum = myPow(sum*sum, n/2);
           // pow=pow/2;
        }
        else if(n%2==1){
            sum = myPow(sum*sum, n/2) * sum;
        }
        return sum;
    }
}