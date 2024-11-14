package Task_nov14;

public class enm2 {
    public static void main(String[] args) {
        System.out.println(Color.RED);
        if(Color.BLUE.gethexcode().equals("#3377FF")){
            System.out.println("color is blue");
        }

    }
}
enum Color {
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");
  private  String hexcode;
  Color(String hexcode ){
      this.hexcode=hexcode;
  }
  String gethexcode(){
      return hexcode;
  }
}


