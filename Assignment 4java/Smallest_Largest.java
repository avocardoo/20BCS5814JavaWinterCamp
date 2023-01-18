import java.util.Scanner;

public class Smallest_Largest {
       public  int smallest(int arr[], int n){
           int min=arr[0];
           for (int i = 0; i < n; i++) {
               if(arr[i]<min){
                   min=arr[i];
               }
           }
           return min;
       }

       public  int largest(int arr[], int n){
           Scanner scan = new Scanner(System.in);
           scan.nextInt();
           int max=arr[0];
           for (int i = 0; i < n; i++) {
               if(arr[i]>max){
                   max=arr[i];
               }
           }
           return max;
       }

}
