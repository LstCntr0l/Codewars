//https://www.codewars.com/kata/5270d0d18625160ada0000e4/java
import java.util.Arrays;
public class Greed{
    public static int greedy(int[] dice){
        Arrays.sort(dice);
        int number=0,points=0;
        for(int i=1;i<7;i++){

            for(int j=0;j<5;j++)
                if(dice[j]==i)
                    number++;

            if(i==1){
                if(number>=3){points=points+1000; number=number-3;}
                points=points+(100*number);
            }
            if(i==5){
                if(number>=3){points=points+500; number=number-3;}
                points=points+(50*number);
            }
            if(i==2 && number>=3)
                points+=200;
            if(i==3 && number>=3)
                points+=300;
            if(i==4 && number>=3)
                points+=400;
            if(i==6 && number>=3)
                points+=600;
            number=0;
        }
        return points;
    }
}