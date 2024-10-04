public class string {
    public static void main(String[] args) {
        String a = "hello";
        String b = "world";
       /*
        a=a+b; //hello-world
        b =a.substring(0 ,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println(a);
        System.out.println(b);
*/
        String c;
        c = a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);
    }
}
