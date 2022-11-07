//https://www.codewars.com/kata/513e08acc600c94f01000001/java
public class RgbToHex {

    public static String rgb(int r, int g, int b) {
        if(r>255)
            r=255;
        if(g>255)
            g=255;
        if(b>255)
            b=255;
        if(r<0)
            r=0;
        if(g<0)
            g=0;
        if(b<0)
            b=0;
        String re,gr,bl;
        re=Integer.toHexString(r);
        if(re.length()==1)
            re="0"+re;
        gr=Integer.toHexString(g);
        if(gr.length()==1)
            gr="0"+gr;
        bl=Integer.toHexString(b);
        if(bl.length()==1)
            bl="0"+bl;
        re=re.toUpperCase();
        gr=gr.toUpperCase();
        bl=bl.toUpperCase();
        return re+gr+bl;
    }
}