public class palidromeString {
    public static boolean ispalidrome(String str){
        String rev = new StringBuilder(str).reverse().toString();
        return str.equals(rev);
    }

    public static void main(String[] args) {
        System.out.println(ispalidrome("madam"));//true
        System.out.println(ispalidrome("sir"));//false
    }
}


 

