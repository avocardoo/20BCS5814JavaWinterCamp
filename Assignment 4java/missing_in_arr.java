public class missing_in_arr {
    public static int missing(int arr[],int n){
        int sum= (n*(n+1))/2;
        int present_sum=0;
        for (int i = 0; i < n-1; i++) {
            present_sum+=arr[i];
        }
        return sum-present_sum;
    }
}
