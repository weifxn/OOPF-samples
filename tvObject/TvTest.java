import java.util.Scanner;

public class TvTest {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		// create tv instance
		Tv tv1 = new Tv("S101", "Elba", 'R', 1400);

		System.out.println("Enter rate of tax: ");
		int rate = input.nextInt();
		System.out.println("Amount of tax to be paid: " + tv1.getTax(rate));
	}	
}
