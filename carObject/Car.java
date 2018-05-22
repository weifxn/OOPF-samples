public class Car {
//    encapsulation: cannot use in other class unless set public
//    if set public then can use in cartest using car1.brand
//    to manipulate, need to use setter and getter.
    private String brand;
    private String colour;
    private int engine_size;
    private int speed;

//    default constructor with no parameter
    public Car() {
        brand = "nobrand";
        colour = "white";
        engine_size = 2;
        speed = 0;
    }

//    constructor with parameter
    public Car(String b, String c, int e, int s) {
        brand = b;
        colour = c;
        engine_size = e;
        speed = s;
    }

    //getter always empty parameter
    public String getBrand() {
        return brand;
    }

    // setter always void datatype
    public void setBrand(String s) {
        brand = s;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String s) {
        colour = s;
    }

    public int getEngine_size() {
        return engine_size;
    }

    public void setEngine_size(int n) {
        engine_size = n;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int n) {
        speed = n;
    }

    public void accelerate() {
        speed = speed + 1;
    }

    public void decelerate() {
        speed = speed - 1;
    }

    public void stop() {
        speed = 0;
    }

    @Override //optional
    public String toString(){ // will return to Object
        return String.format("The car with brand %s, color %s, engine size %d is running at speed %d", brand,colour,engine_size,speed);
    }
}
