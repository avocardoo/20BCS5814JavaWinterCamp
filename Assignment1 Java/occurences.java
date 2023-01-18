public class occurences {
    static int count(String str ,char a){
        if (str.length() == 0) {
            return 0;
        }
        int count = 0;
        if (str.charAt(0) == a) {
            count++;
        }
        return count + count(str.substring(1), a);
    }

    public static void main(String[] args) {
        //to find occurrences of a characters in string without using loop
            String s= "hello";
            char target='l';
        System.out.println(count(s,target));
    }
}
