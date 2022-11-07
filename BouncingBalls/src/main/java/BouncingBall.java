//https://www.codewars.com/kata/5544c7a5cb454edb3c000047/java
public class BouncingBall {

    public static int bouncingBall(double h, double bounce, double window) {
        // your code
        if(h<=0 || bounce<=0 || bounce>=1 || window>=h || window<0)
            return -1;
        int count=0;
        while(h>window)
        {
            System.out.println(h);
            h=h*bounce;
            if(count>0)
                count++;
            count++;
        }
        return count;
    }
}