public class RoteateByk {
    public static int[] rotateArray(int []arr, int k,int n){

        while(k>0) {
            int x = arr[n - 1];
            int i=n-1;
            for (i = n - 1; i > 0; i--)
                arr[i] = arr[i - 1];
            arr[0] = x;
            k--;
        }
        return arr;
    }

}
