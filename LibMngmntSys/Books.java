package LibMngmntSys;

import java.util.Scanner;

public class Books {
    Books theBooks[] = new Books[50];
    public static int count;

    Scanner input = new Scanner(System.in);

    public int compareBooksObjects(Books b1, Books b2) {

        if (b1.BookNames.equalsIgnoreCase(b2.BooksName)) {

            System.out.println(
                    "Bookss of this Name Already Exists.");
            return 0;
        }

        // if Books serial matches
        if (b1.sNo == b2.sNo) {

            // Print Bookss exists
            System.out.println("Books of this Serial No Already Exists.");

            return 0;
        }
        return 1;
    }

    // Method 2
    // To add Bookss
    public void addBookss(Books b) {

        for (int i = 0; i < count; i++) {

            if (this.compareBooksObjects(b, this.theBooks[i]) == 0)
                return;
        }

        if (count < 50) {

            theBooks[count] = b;
            count++;
        } else {

            System.out.println(
                    "No Space to Add More Books.");
        }
    }

    // Method 3
    // To search Books by serial number
    public void searchBySno() {

        // Display message
        System.out.println(
                "\t\t\t\tSEARCH BY SERIAL NUMBER\n");

        // Class data members
        int sNo;
        System.out.println("Enter Serial No of Books:");
        sNo = input.nextInt();

        int flag = 0;
        System.out.println(
                "S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");

        for (int i = 0; i < count; i++) {
            if (sNo == theBooks[i].sNo) {
                System.out.println(
                        theBooks[i].sNo + "\t\t"
                                + theBooks[i].BooksName + "\t\t"
                                + theBooks[i].authorName + "\t\t"
                                + theBooks[i].BooksQtyCopy + "\t\t"
                                + theBooks[i].BooksQty);
                flag++;
                return;
            }
        }
        if (flag == 0)
            System.out.println("No Books for Serial No " + sNo + " Found.");
    }

    // Method 4
    // To search author by name
    public void searchByAuthorName() {

        // Display message
        System.out.println(
                "\t\t\t\tSEARCH BY AUTHOR'S NAME");

        input.nextLine();

        System.out.println("Enter Author Name:");
        String authorName = input.nextLine();

        int flag = 0;

        System.out.println(
                "S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");

        for (int i = 0; i < count; i++) {

            // if author matches any of its Bookss
            if (authorName.equalsIgnoreCase(
                    theBooks[i].authorName)) {

                // Print below corresponding credentials
                System.out.println(
                        theBooks[i].sNo + "\t\t"
                                + theBooks[i].BooksName + "\t\t"
                                + theBooks[i].authorName + "\t\t"
                                + theBooks[i].BooksQtyCopy + "\t\t"
                                + theBooks[i].BooksQty);
                flag++;
            }
        }

        // Else no Bookss matches for author
        if (flag == 0)
            System.out.println("No Booksss of " + authorName
                    + " Found.");
    }

    // Method 5
    // To display all Booksss
    public void showAllBooksss() {

        System.out.println("\t\t\t\tSHOWING ALL BookssS\n");
        System.out.println(
                "S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");

        for (int i = 0; i < count; i++) {

            System.out.println(
                    theBooks[i].sNo + "\t\t"
                            + theBooks[i].BooksName + "\t\t"
                            + theBooks[i].authorName + "\t\t"
                            + theBooks[i].BooksQtyCopy + "\t\t"
                            + theBooks[i].BooksQty);
        }
    }

    // Method 6
    // To edit the Bookss
    public void upgradeBooksQty() {

        System.out.println(
                "\t\t\t\tUPGRADE QUANTITY OF A Bookss\n");
        System.out.println("Enter Serial No of Bookss");

        int sNo = input.nextInt();

        for (int i = 0; i < count; i++) {

            if (sNo == theBooks[i].sNo) {

                // Display message
                System.out.println(
                        "Enter No of Books to be Added:");

                int addingQty = input.nextInt();
                theBooks[i].BooksQty += addingQty;
                theBooks[i].BooksQtyCopy += addingQty;

                return;
            }
        }
    }

    // Method 7
    // To create menu
    public void dispMenu() {

        // Displaying menu
        System.out.println(
                "----------------------------------------------------------------------------------------------------------");
        System.out.println("Press 1 to Add new Books.");
        System.out.println("Press 0 to Exit Application.");
        System.out.println(
                "Press 2 to Upgrade Quantity of a Books.");
        System.out.println("Press 3 to Search a Books.");
        System.out.println("Press 4 to Show All Books.");
        System.out.println("Press 5 to Register Student.");
        System.out.println(
                "Press 6 to Show All Registered Students.");
        System.out.println("Press 7 to Check Out Books. ");
        System.out.println("Press 8 to Check In Books");
        System.out.println(
                "-------------------------------------------------------------------------------------------------------");
    }

    // Method 8
    // To search the library
    public int isAvailable(int sNo) {

        for (int i = 0; i < count; i++) {
            if (sNo == theBooks[i].sNo) {
                if (theBooks[i].BooksQtyCopy > 0) {

                    System.out.println(
                            "Books is Available.");
                    return i;
                }
                System.out.println("Books is Unavailable");
                return -1;
            }
        }

        System.out.println("No Books of Serial Number " + " Available in Library.");
        return -1;
    }

    // Method 9
    // To remove the Bookss from the library
    public Books checkOutBookss() {

        System.out.println(
                "Enter Serial No of Bookss to be Checked Out.");
        int sNo = input.nextInt();

        int BookssIndex = isAvailable(sNo);

        if (BookssIndex != -1) {
            theBooks[BookssIndex].BooksQtyCopy--;
            return theBooks[BookssIndex];
        }
        return null;
    }

    // Method 10
    // To add the Bookss to the Library
    public void checkInBookss(Books b) {
        for (int i = 0; i < count; i++) {
            if (b.equals(theBooks[i])) {
                theBooks[i].BooksQtyCopy++;
                return;
            }
        }
    }
}
