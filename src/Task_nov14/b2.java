package Task_nov14;

public class b2 {
    public static void main(String[] args) {
      Student1 s1 = new Student1(23);
      Student1 s2 = new Student1(33);
        System.out.println(Student1.school_Name);


    }
}
class Student1{
    int age ;
    static String school_Name="abc";
    public Student1(int age){
        this.age=age;
    }


    {
        System.out.println("IIB");
        System.out.println("ut will excueted the one time with creation of the obeject");
        System.out.println("reading");
    }
    static {
        System.out.println("SIB");
        System.out.println("it will excueted the how many objects is created ");
        System.out.println("reading");
    }



}
