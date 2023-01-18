import java.util.*;
public class weird {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n=sc.nextInt();
        if(n%2==0){
            if(n>1 && n<=10){
                System.out.println("not weird");
            } else if (n>10 && n<=20) {
                System.out.println("weird");
            } else if (n>20) {
                System.out.println("not weird");
            }
        }else{
            System.out.println("Weird");
        }
    }
}
