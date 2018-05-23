public class StaticTest {

    public static void main(String[] args) {
        Static.num2 = 10;
        Static.cMethod();

        Static a = new Static();

        a.num1 = 10;


        System.out.println(a.num1);

        System.out.println(a.num2);
        

        
    }
}
