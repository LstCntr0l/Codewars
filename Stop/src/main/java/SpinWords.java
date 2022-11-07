//https://www.codewars.com/kata/5264d2b162488dc400000001/java
public class SpinWords {

    public String spinWords(String sentence) {
        //TODO: Code stuff here
        String[] splited = sentence.split("\\s+");
        StringBuilder input = new StringBuilder();
        String word="";
        for(String s:splited){
            input.setLength(0);
            input.append(s);
            if(s.length()>4){
                input.reverse();
            }
            if(s==splited[splited.length-1])
                word=word+input;
            else
                word=word+input+" ";
        }
        return word;
    }
}