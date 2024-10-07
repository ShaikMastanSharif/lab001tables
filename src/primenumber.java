public class primenumber {


    public static boolean isPrimeNumber(int num){
        if(num<=1){
            return false;
        }
        for (int i =2 ;i<num ;i++){
            if(num % 2==0){
                return false;
            }

        }
        return true;

    }

    public static void getPrimeNumber(int num){
        for(int i=2;i<num;i++){
            if(isPrimeNumber(i)){
                System.out.println(i + "  ");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(5));
        getPrimeNumber(10);
        getPrimeNumber(20);
    }
}