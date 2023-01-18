public class Exceptionss {
    public static void main(String[] args) {
        try{
            int age=9;
            if(age<18){
                throw new myexception("age too small");
            }
        }
        catch (myexception e){
            System.out.println(e.getMessage());
        }
    }
}
