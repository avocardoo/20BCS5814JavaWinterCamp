public class percentage {
    static void charPercentage(String input){
        int total= input.length();
        int uc=0;
        int lc=0;
        int digit=0;
        int others=0;
        for(int i=0;i<total;i++){
           char ch= input.charAt(i);
           if(Character.isUpperCase(ch)){
               uc++;
           } else if (Character.isLowerCase(ch)) {
               lc++;
           } else if (Character.isDigit(ch)) {
               digit++;
           }
           else{
               others++;
           }
        }
        double ucp= ( uc * 100) / total;
        double lcp= ( lc * 100) / total;
        double dp= ( digit * 100) / total;
        double op= ( others * 100) / total;
        System.out.println("uppercase percentage is: "+ucp);
        System.out.println("lowercase percentage is: "+lcp);
        System.out.println("digits percentage is: "+dp);
        System.out.println("special characters percentage is: "+op);
    }
    public static void main(String[] args) {
        charPercentage("Hii ! you are 100% Idiot##");
    }
}
