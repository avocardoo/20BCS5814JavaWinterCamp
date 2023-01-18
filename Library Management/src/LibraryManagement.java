import java.util.*;
public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        LibFunctions lb= new LibFunctions();
        new LibFunctions("Manju");
        int choice = 0;
        do{
            System.out.println("Library Functions--- ");
            System.out.println("1.View Books");
            System.out.println("2. Return Book");
            System.out.println("3. Issue Book ");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            try{
                choice= sc.nextInt();
                if(choice<0){
                    throw new myexception("please enter provided choices!!!!  ");
                }
            }
            catch (myexception e){
                System.out.println(e.getMessage());
            }

            switch (choice){
                case 1:
                    lb.viewBooks();
                    break;
                
                case 2:
                    lb.returnBook();
                    break;
                case 3:
                    lb.issueBook();
                    break;

            }
            

        }while(choice!=4);
        exit ex= new exit();
    }
}
