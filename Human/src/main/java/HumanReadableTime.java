//https://www.codewars.com/kata/52685f7382004e774f0001f7/java
public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        String time="";
        int hours,minutes;

        if(seconds>=3600){
            hours=seconds/3600;
            seconds=seconds-(hours*3600);
            if(hours<10)
                time=time+"0";
            time=time+Integer.toString(hours)+":";
        }

        else
            time=time+"00:";

        if(seconds>=60){
            minutes=seconds/60;
            seconds=seconds-(minutes*60);
            if(minutes<10)
                time=time+"0";
            time=time+Integer.toString(minutes)+":";
        }

        else
            time=time+"00:";

        if(seconds>=10)
            time=time+Integer.toString(seconds);
        else if(seconds<10)
            time=time+"0"+Integer.toString(seconds);
        else
            time=time+"00";
        return time;
    }
}