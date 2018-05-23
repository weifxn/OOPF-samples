public class Static{ 
    public int num1; // object variable
    public static int num2; // class variable

    public void iMethod() { // non static method can modify both static and non
        num1 = 10;
        num2 = 10;
    }

    public static void cMethod() { // static method can only modify non static
        num2 = 10;
        // num1 = 10;
    }


}
