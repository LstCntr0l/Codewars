//https://www.codewars.com/kata/52774a314c2333f0a7000688
public class Solution{

    public static boolean validParentheses(String parens)
    {

        parens=parens.replaceAll("[^()]", "");
        while(parens.contains("()")){
            if(parens.contains("()")) parens = parens.replace("()", "");
        }
        System.out.println(parens);
        if(parens.length() != 0) return false;
        else return true;
    }
}