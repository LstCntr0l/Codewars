//https://www.codewars.com/kata/5266876b8f4bf2da9b000362/java
class Solution {
    public static String whoLikesIt(String... names) {
        String whoLike="";

        if(names.length==0)
            whoLike="no one likes this";

        if(names.length==1)
            whoLike=names[0]+" likes this";

        if(names.length==2)
            whoLike=names[0]+" and "+names[1]+" like this";

        if(names.length==3)
            whoLike=names[0]+", "+names[1]+" and "+names[2]+" like this";
        if(names.length>3)
            whoLike=names[0]+", "+names[1]+" and "+Integer.toString(names.length-2)+" others like this";
        return whoLike;
    }
}