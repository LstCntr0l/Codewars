//https://www.codewars.com/kata/554e4a2f232cdd87d9000038/java
public class DnaStrand {
    public static String makeComplement(String dna) {
        //Your code
        String DNA="";
        for(int i=0;i<dna.length();i++)
        {
            if(dna.charAt(i)=='A')
                DNA+='T';
            if(dna.charAt(i)=='T')
                DNA+='A';
            if(dna.charAt(i)=='C')
                DNA+='G';
            if(dna.charAt(i)=='G')
                DNA+='C';
        }
        return DNA;
    }
}