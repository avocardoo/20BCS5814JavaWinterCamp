public class min_distance {
    public static void distance(int arr[],int n){
        for (int i = 0; i < n; i++) {
            for (int j =0; j <n ; j++) {

                System.out.print(Math.abs(arr[i]-arr[j])+" ");
            }
            System.out.println();
        }
    }
}
