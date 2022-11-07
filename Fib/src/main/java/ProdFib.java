//https://www.codewars.com/kata/5541f58a944b85ce6d00006a/java
public class ProdFib { // must be public for codewars

    public static long[] productFib(long prod) {
        long[]fi=new long[3];
        long []sequence={0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,
                1597,2584,4181, 6765, 10946, 17711, 28657, 46368,
                75025, 121393, 196418, 317811,514229,832040,1346269,
                2178309,3524578,5702887,9227465,14930352,24157817,
                39088169,63245986,102334155,165580141,267914296,433494437,
                701408733,1134903170,1836311903,2971215073L
        };
        int i=0;
        System.out.println(prod);
        long multiply=0;
        while(multiply<prod){
            multiply=0;
            i++;
            multiply=sequence[i]*sequence[i-1];
            if(multiply==prod)
            {
                fi[0]=sequence[i-1];
                fi[1]=sequence[i];
                fi[2]=1;
                break;
            }
            if(multiply>prod)
            {
                fi[0]=sequence[i-1];
                fi[1]=sequence[i];
                fi[2]=0;
                break;
            }
        }

        return fi;
    }
}