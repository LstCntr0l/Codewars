//https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/java
import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        text=text.toLowerCase();
        char[] chars = text.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for(char c : chars)
        {
            if(map.containsKey(c)) {
                int counter = map.get(c);
                map.put(c, ++counter);
            } else {
                map.put(c, 1);
            }
        }
        int dupl=0;
        for(char c : map.keySet()) {
            if(map.get(c) > 1) {
                dupl++;
            }
        }

        return dupl;
    }

}