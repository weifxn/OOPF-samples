import java.util.ArrayList;

public class carTest {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<Car>();
//        define object variable
        Car car1, car2, car3;

//        new to create object/ calling the constructor
        car1 = new Car("Tesla", "black",3,400);
        car2 = new Car("Toyota","red",3,100);
        car3 = new Car("Honda","yellow",4,200);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        System.out.println("car1: "+car1);
//        equivalent to calling the toString method in car1
//        same as car1.toString()
        System.out.println("car2: "+car2);
        System.out.println("car3: "+car3);

        System.out.println("The brands are "+car1.getBrand()+", "+car2.getBrand()+", "+car3.getBrand());

        car1.accelerate();
        car2.decelerate();
        car3.stop();

        car3.setBrand("Mitsubishi");
        car3.setColour("black");
        car3.setEngine_size(5);

        System.out.println("car1: "+car1);
        System.out.println("car2: "+car2);
        System.out.println("car3: "+car3);

        for(Car c: cars) { // print out all cars in AL
            System.out.println("Before: " + c);
            c.accelerate();
            System.out.println("After: " + c);
        }
    }
}
