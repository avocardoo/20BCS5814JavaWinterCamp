import java.util.*;

public class sortString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter string : ");

       String s= sc.next();
        char arr[]= s.toCharArray();
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if((int)arr[j]> (int)arr[j+1]){
                    char temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(arr);
    }
}
