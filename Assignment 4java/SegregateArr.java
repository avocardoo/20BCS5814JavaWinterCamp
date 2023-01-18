import java.util.*;
public class SegregateArr {
    public static int[] segregate(int a[]){
        int count0=0;
        for (int i = 0; i < a.length; i++) {
               if(a[i]==0){
                count0++;
            }
        }

        for (int i = 0; i < count0; i++) {
            a[i]=0;
        }
        for (int i = count0; i < a.length; i++) {
            a[i]=1;
        }
        return a;

    }

}
