

public class Second_small_large {
    public static int smallest_2nd(int arr[], int n){
        int min=arr[0];
        for (int i = 0; i < n; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int second_min= Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i]<second_min && arr[i]>min){
                second_min=arr[i];
            }
        }
        return second_min;

    }

public static int second_largest(int arr[],int n){
    for (int i = 0; i < n; i++) {
        for (int j = i+1; j < n; j++) {
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

    }
    return arr[n-2];
}



}

