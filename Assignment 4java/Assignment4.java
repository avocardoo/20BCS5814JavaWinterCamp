import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {

        ScannerException scn = new ScannerException();

        Smallest_Largest sl= new Smallest_Largest();
        int[] arr= scn.input();
        //smallest/largest
//        System.out.println(sl.smallest(arr,arr.length));
//        System.out.println(sl.largest(arr,arr.length));


        //segregate 0 and 1
        //        SegregateArr sg= new SegregateArr();
//        arr= sg.segregate(arr);
//        for (int a:arr) {
//            System.out.print(a+" ");
//        }

        //rotate by k values
//        RoteateByk rt= new RoteateByk();
//        arr= rt.rotateArray(arr,2,arr.length);
//        for (int a:arr) {
//            System.out.print(a+" ");
//        }

//        second smallest/largest
//        Second_small_large ss= new Second_small_large();
//        System.out.println(ss.smallest_2nd(arr,arr.length));
//        System.out.println( ss.second_largest(arr,arr.length));

        //minimum distance
//        min_distance md= new min_distance();
//        md.distance(arr,arr.length);

        //missing in array
//        missing_in_arr mr= new missing_in_arr();
//        System.out.println("missing element in array is: ");
//        System.out.println(mr.missing(arr,arr.length));


        //leaders in array
//        leader_in_arr ld= new leader_in_arr();
//        ld.leader(arr, arr.length);

        //searching x in array

        searchX sx= new searchX();
        System.out.println("enter element to search: ");
        Scanner scan= new Scanner(System.in);
        int x= scan.nextInt();
        sx.search(arr,arr.length,x);

    }
}
