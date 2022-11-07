//https://www.codewars.com/kata/526571aae218b8ee490006f4/java
public class BitCounting {

    public static int countBits(int n){
        // Show me the code!
        int licz=0;
        String result=Integer.toBinaryString(n);
        for(int i=0;i<result.length();i++)
        {
            if(result.charAt(i)=='1')
                licz++;
        }
        return licz;

    }

}