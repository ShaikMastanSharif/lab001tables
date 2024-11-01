public class reversestring {

    public static boolean palidrome(String str){
        String str1= new StringBuffer(str).reverse().toString();
       return str1.equals(str);

    }
    public static void main(String[] args) {
        System.out.println(palidrome("madam"));
        System.out.println(palidrome("sir"));
    }
    }
