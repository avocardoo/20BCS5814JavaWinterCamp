public class leader_in_arr {
    public static void leader(int arr[],int n){
        for (int i = 0; i < n; i++) {
            int j;
            for (j = i+1; j <n ; j++) {
                if(arr[i]<=arr[j]){
                    break;
                }
            }
            if(j==n){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
