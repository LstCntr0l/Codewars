//https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec/java
class Persist {
    public static int persistence(long n) {
        // your code
        int count=0,temp=1;
        while(n>9){
            while(n!=0)
            {
                temp*=(n%10);
                n=n/10;
            }
            n=temp;
            temp=1;
            count++;
        }
        return count;
    }
}