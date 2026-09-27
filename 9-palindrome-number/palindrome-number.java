class Solution {
    public boolean isPalindrome(int x) {
        int org=x;
        int rev=0;
        while(x<0){
            return false;
        }
        while(x>0){
            int ls=x%10;
            rev=rev*10+ls;
            x=x/10;
        }
        return org==rev;
        
    }
}