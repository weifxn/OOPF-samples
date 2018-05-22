import java.util.Scanner;

public class AccountTest {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                double credit, debit;
                

                Account account1 = new Account(50.00);
                Account account2 = new Account(8.93);

                System.out.println("account1 balance: " + account1.getBalance());
                System.out.println("account2 balance: " + account2.getBalance());
                 
                System.out.println();
                
                System.out.print("Enter amount to be deposited for account1: ");
                credit = input.nextDouble();
                account1.Credit(credit); // setter: increase balance and total


                System.out.print("Enter amount to be deposited for account2: ");
                credit = input.nextDouble();
                account2.Credit(credit); // setter

                System.out.println();
                
                // getter: display balance
                System.out.println("account1 balance: " + account1.getBalance());
                System.out.println("account2 balance: " + account2.getBalance());

                System.out.println();

                System.out.print("Enter amount to be withdrawn for account1: ");
                debit = input.nextDouble();
                account1.Debit(debit); // setter: decrease balance and total

                System.out.print("Enter amount to be withdrawn for account2: ");
                debit = input.nextDouble();
                account2.Debit(debit); // setter

                System.out.println();

                // getter: display balance
                System.out.println("account1 balance: " + account1.getBalance());
                System.out.println("account2 balance: " + account2.getBalance());


                System.out.println();
                
                // getter: display total
                System.out.println("Total balance of all accounts is: " + Account.getTotal());

        }
}
