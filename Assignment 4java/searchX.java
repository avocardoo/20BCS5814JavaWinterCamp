public class searchX {
    public static void search(int arr[],int n,int x){
        for (int i = 0; i < n; i++) {
            if(arr[i]==x){
                System.out.println(i);
                break;
            }

        }
    }
}
