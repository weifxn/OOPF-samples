public class Account {
        private double balance;
        private static double total;
      
        
        public Account(double initialBalance) {
               // balance = initialBalance;
               // use setter in constructor
               setBalance(initialBalance); 
               // adding total in class file
               increaseTotal(initialBalance);
        }
        
        // setter: increase balance
        public void Credit(double c) {
                setBalance(balance + c);
                increaseTotal(c);
        }
        // setter: decrease balance
        public void Debit(double d) {
                if (d < balance) {
                        setBalance(balance - d);
                        decreaseTotal(d);
                }
                else {
                        System.out.println("Debit amount exceeded account balance. ");
                }
        }
        
        // getter 
        public double getBalance() {
                return balance;
        }
        
        // setter: check b positive number
        public void setBalance(double b) {
                if (b<0) {
                } else {
                        balance = b;
                }
        }

        // class setter for increase total
        public static void increaseTotal(double i) {
                if(i<0) {
                } else {
                    total += i;
                }
        }
        
        // class setter for  decrease total
        public static void decreaseTotal(double d) {
                if(d<0) {
                } else {
                    total -= d;
                }
        }
        
        // getter for total
        public static double getTotal() {
                return total;
        }
}
