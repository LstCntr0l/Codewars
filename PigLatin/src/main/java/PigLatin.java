//https://www.codewars.com/kata/520b9d2ad5c005041100000f/java
public class PigLatin {

    public static String pigIt(String str) {
        String[] splited = str.split("\\s+");
        String word="";
        for(int i=0;i<splited.length;i++){
            if(splited[i].charAt(0)<65||splited[i].charAt(0)>122)
            {word=word+splited[i];
                continue;
            }
            splited[i]=splited[i].substring(1)+splited[i].substring(0,1)+"ay";

            if(i==splited.length-1)
                word=word+splited[i];
            else
                word=word+splited[i]+" ";
        }
        return word;
    }
}