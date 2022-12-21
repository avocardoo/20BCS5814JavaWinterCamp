package LibMngmntSys;

// Java Program to Illustrate students Class
// To Do all the Operations related to students:
// add Students,check-in Booksss,check out Booksss,ValidStudent

// Importing required classes
import java.util.Scanner;

// Class
public class Students {

    // Creating objects of Scanner and students class
    Scanner input = new Scanner(System.in);
    Student theStudents[] = new Student[50];

    public static int count = 0;

    // Method 1
    // To add Books
    public void addStudent(Student s) {
        for (int i = 0; i < count; i++) {

            if (s.regNum.equalsIgnoreCase(
                    theStudents[i].regNum)) {

                // Print statement
                System.out.println(
                        "Student of Reg Num " + s.regNum + " is Already Registered.");

                return;
            }
        }

        if (count <= 50) {
            theStudents[count] = s;
            count++;
        }
    }

    // Method 2
    // Displaying all students
    public void showAllStudents() {
        // Printing student name and
        // corresponding registered number
        System.out.println("Student Name\t\tReg Number");
        for (int i = 0; i < count; i++) {

            System.out.println(theStudents[i].studentName
                    + "\t\t"
                    + theStudents[i].regNum);
        }
    }

    // Method 3
    // To check the Student
    public int isStudent() {
        // Display message only
        System.out.println("Enter Reg Number:");

        String regNum = input.nextLine();

        for (int i = 0; i < count; i++) {

            if (theStudents[i].regNum.equalsIgnoreCase(
                    regNum)) {
                return i;
            }
        }

        // Print statements
        System.out.println("Student is not Registered.");
        System.out.println("Get Registered First.");

        return -1;
    }

    // Method 4
    // To remove the Bookss
    public void checkOutBookss(Books Bookss) {
        int studentIndex = this.isStudent();

        if (studentIndex != -1) {
            System.out.println("checking out");

            Bookss.showAllBooksss();
            Books b = Bookss.checkOutBookss();

            System.out.println("checking out");
            if (b != null) {

                if (theStudents[studentIndex].BooksssCount <= 3) {

                    System.out.println("adding Bookss");
                    theStudents[studentIndex].borrowedBooksss[theStudents[studentIndex].BooksssCount] = b;
                    theStudents[studentIndex].BooksssCount++;

                    return;
                } else {

                    System.out.println(
                            "Student Can not Borrow more than 3 Booksss.");
                    return;
                }
            }
            System.out.println("Bookss is not Available.");
        }
    }

    // Method 5
    // To add the Bookss
    public void checkInBookss(Books Books) {
        int studentIndex = this.isStudent();
        if (studentIndex != -1) {

            // Printing credentials corresponding to student
            System.out.println(
                    "S.No\t\t\tBookss Name\t\t\tAuthor Name");

            Student s = theStudents[studentIndex];

            for (int i = 0; i < s.BooksssCount; i++) {

                System.out.println(
                        s.borrowedBooksss[i].sNo + "\t\t\t"
                                + s.borrowedBooksss[i].BooksName + "\t\t\t"
                                + s.borrowedBooksss[i].authorName);
            }

            // Display message only
            System.out.println(
                    "Enter Serial Number of Bookss to be Checked In:");

            int sNo = input.nextInt();

            for (int i = 0; i < s.BooksssCount; i++) {
                if (sNo == s.borrowedBooksss[i].sNo) {
                    Books.checkInBookss(s.borrowedBooksss[i]);
                    s.borrowedBooksss[i] = null;

                    return;
                }
            }

            System.out.println("Bookss of Serial No " + sNo + "not Found");
        }
    }
}
