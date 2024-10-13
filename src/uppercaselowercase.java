public class uppercaselowercase {
    public static void main(String[] args) {
        String str=" i am SHAIK masTans ShariFF";
        int upper=0;
        int lower=0;
        for(char c:str.toCharArray()){
            if(Character.isUpperCase(c)){
                upper++;
            } else if (Character.isLowerCase(c)) {
                lower++;

            }

        }
        System.out.println( "uppercharacter" + " " +upper);
        System.out.println( "lowercharcter" + " " +lower);
    }
}
