//https://www.codewars.com/kata/526dbd6c8c0eb53254000110/java
public class SecureTester{

    public static boolean alphanumeric(String s){
        if (s.length()==0) return false;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)<48) return false;
            if(s.charAt(i)>57 && s.charAt(i)<65) return false;
            if(s.charAt(i)>90 && s.charAt(i)<97) return false;
            if(s.charAt(i)>122) return false;
        }
        return true;
    }

}