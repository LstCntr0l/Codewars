//https://www.codewars.com/kata/578aa45ee9fd15ff4600090d/java
public class Kata {
    public static int[] sortArray(int[] array) {
        for(int i=0;i<array.length;i++){
            int min=array[i];
            int temp=array[i];
            int saveJ=i;
            if(min%2!=0){
                for(int j=array.length-1;j>=i;j--){
                    if(array[j]%2!=0 && temp>array[j])
                    {
                        temp=array[j];
                        saveJ=j;
                    }
                }
                System.out.println(temp);
                array[i]=temp;
                array[saveJ]=min;
            }
        }
        return array;
    }
}