//https://www.codewars.com/kata/5656b6906de340bd1b0000ac/java
import java.util.Arrays;

public class TwoToOne {

    public static String longest (String s1, String s2) {
        String dual="";
        String letter;
        for(int i=0;i<s1.length();i++)
        {
            letter=Character.toString(s1.charAt(i));
            if(!dual.contains(letter))
                dual=dual+letter;
        }
        for(int i=0;i<s2.length();i++)
        {
            letter=Character.toString(s2.charAt(i));
            if(!dual.contains(letter))
                dual=dual+letter;
        }
        char tempArray[] = dual.toCharArray();
        Arrays.sort(tempArray);
        return new String (tempArray);
    }
}