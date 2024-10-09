public class palidrome {
public static void  pd(int num){
    int r=0;
    int sum=0;
    int t;
    t=num;
     while(num>0){
         r=num%10;
         sum=(sum*10)+r;
         num=num/10;

     }
     if(t == sum ){
         System.out.println("palidrome");
     }else{
         System.out.println("is not palidrome");
     }
}
    public static void main(String[] args) {
pd(151);
pd(152);
    }
}
