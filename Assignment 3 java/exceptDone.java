import java.util.Scanner;
public class exceptDone {

    public static void main(String[] args) {
        //using while loop
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a word:");
        String s1= sc.next();
        while (!s1.equals("done")){

            if(s1.charAt(0)==s1.charAt(s1.length()-1)){
                System.out.println("first and last character are equal");
            }
            else{
                System.out.println("first and last character are not equal");
            }
            s1 = sc.next();

        }







        //using do-while loop
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("enter a word:");
//        String s1= sc.next();
//        do {
//
//            if(s1.charAt(0)==s1.charAt(s1.length()-1)){
//                System.out.println("first and last character are equal");
//            }
//            else{
//                System.out.println("first and last character are not equal");
//            }
//            s1 = sc.next();
//
//        } while (!s1.equals("done"));

    }
}
