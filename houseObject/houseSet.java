import java.util.Scanner;

public class houseSet {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		House house1 = new House("White",2200);

		System.out.println(house1.getColor());

		System.out.println("Insert price: ");

		int price = input.nextInt();

		house1.setPrice(price);

		System.out.println(house1.getPrice());
		
	}
}
