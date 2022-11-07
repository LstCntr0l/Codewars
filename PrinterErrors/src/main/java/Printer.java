//https://www.codewars.com/kata/56541980fa08ab47a0000040/java
public class Printer {

    public static String printerError(String s) {
        // your code
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>109)
                count++;
        }
        String forReturn=String.valueOf(count)+'/'+s.length();
        return forReturn;
    }
}