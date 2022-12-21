//Illustrate Bookss that takes input from the Booksss and related information
package LibMngmntSys;

import java.util.Scanner;

public class Book {
    public int sNo;
    public String BooksName;
    public String authorName;
    public int BooksQty;
    public int BooksQtyCopy;

    Scanner input = new Scanner(System.in);

    public Book() {
        System.out.println("Enter Serial no of Books: ");
        this.sNo = input.nextInt();
        input.nextLine();

        System.out.println("Enter Bookss Name: ");
        this.BooksName = input.nextLine();

        System.out.println("Enter Author Name: ");
        this.authorName = input.nextLine();

        System.out.println("Enter Quantity of Books");
        this.BooksQty = input.nextInt();
        BooksQtyCopy = this.BooksQty;

    }

}