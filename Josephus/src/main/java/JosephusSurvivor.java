import java.util.List;
import java.util.ArrayList;

public class JosephusSurvivor {
    public static int josephusSurvivor(final int n, final int k) {
        List<Integer>lista=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            lista.add(i);
        }
        int i=0;
        while(lista.size()>1)
        {
            i=i+k;
            while(i>lista.size())
                i=i-lista.size();
            lista.remove(i-1);
            i--;
        }
        return lista.get(0);
    }
}