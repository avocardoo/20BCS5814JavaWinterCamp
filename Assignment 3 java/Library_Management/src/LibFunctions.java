import java.util.*;
public class LibFunctions implements LibraryFunctions {
   public void viewBooks(){
       System.out.println("Available books are:");
       System.out.println("Book1");
       System.out.println("Book2");
       System.out.println("Book3");
   }
   public void returnBook(){
       System.out.println("Name the book you want to return:");
       Scanner sc= new Scanner(System.in);
       String s= sc.nextLine();
       System.out.println("Book returned! Thankyou!!");
   }
   public void issueBook(){
       System.out.println("Name the book you want to issue:");
       Scanner sc= new Scanner(System.in);
       String s= sc.nextLine();

       System.out.println("Book issued! Thankyou!!");
   }


}
