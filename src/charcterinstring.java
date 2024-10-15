public class charcterinstring {
    public static void main(String[] args) {
        String str = " testing world with sharif automation labs";
        int count=0;
        for(char c: str.toCharArray()){
            if(c=='a'){
                count++;

            }
        }
        System.out.println(count);
    }
}
