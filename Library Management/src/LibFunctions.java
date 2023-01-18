import java.util.*;
public class LibFunctions implements LibraryFunctions {
    String title;
//    ArrayList<String> book_list = new ArrayList<>();
    TreeMap<Integer,String> tm= new TreeMap<>();
    LibFunctions() {

//        book_list.add("Book1");
//        book_list.add("Book2");
//        book_list.add("Book3");
//        book_list.add("Book4");

        tm.put(1,"Book1");
        tm.put(2,"Book2");
        tm.put(5,"Book5");
        tm.put(3,"Book3");
        tm.put(4,"Book4");
    }


    private String s=null;

//    LibFunctions(){
//        System.out.println("Welcome to Library Management system!!");
//    }
    LibFunctions(String s){
        this.s=s;
        System.out.println("Hii "+ s );
    }
   public void viewBooks(){
       System.out.println("Available books are:");

//       for (String b:book_list) {
//           System.out.println(b);
//       }
       for (Map.Entry<Integer,String>me: tm.entrySet()) {
           System.out.print(me.getKey()+" : ");
           System.out.println(me.getValue());
       }
   }
   public void returnBook(){
       System.out.println("Id of the book you want to return:");
       Scanner sc= new Scanner(System.in);
       int s1= sc.nextInt();
       System.out.println("Name of book you want to return: ");
       Scanner scn= new Scanner(System.in);
       String s= scn.nextLine();
       System.out.println("Book returned! Thankyou!!");
//       book_list.add(s1);
       tm.put(s1,s);
   }
   public void issueBook(){
       System.out.println("Id of the book you want to issue:");

       try{
           Scanner sc= new Scanner(System.in);
           int s= sc.nextInt();
           if(!tm.containsKey(s)){

               throw new myexception("This Book is not available!!  ");
           }
           else{
               System.out.println("Book issued! Thankyou!!");
//               book_list.remove(s);
               tm.remove(s);
           }
       }
       catch (myexception e){
           System.out.println(e.getMessage());
       }


        }
   }




class exit extends exitLib{
    exit(){
        super();
    }
}
