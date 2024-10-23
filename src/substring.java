public class substring {


    public static boolean isSubString(String main ,String sub){
        return  main.matches((".*" +sub+".*"));
    }
    public static void main(String[] args) {
        System.out.println(isSubString("naveen automation labs","labs"));
        System.out.println(isSubString("naveen automation labs","labss"));
        System.out.println(isSubString("naveen ","e"));
        System.out.println(isSubString("naveen11","11"));

    }
}
