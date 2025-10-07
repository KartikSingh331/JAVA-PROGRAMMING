//package OOPs;
//
//class Account {
//    // Data security
//    private double balance;
//
//    // method: public (getter)
//    public double getBalance() {
//
//        if(return==true){
//            //deposit the money
//        }
//        else{
//            // throw a meaningful message to the user
//        }
//        return balance;
//    }
//
//    // method: public (setter / deposit)
//    public void setBalance(double amount) {
//        // perform authentication
//        boolean result = validate("Sachin", "Sachin123");
//
//        if (result) {
//            // deposit the money
//            this.balance = this.balance + amount;
//            System.out.println("Credited to the account");
//        } else {
//            // throw a meaningful message to user
//            System.out.println("Invalid username or password");
//        }
//    }
//
//    // private authentication method
//    private boolean validate(String username, String password) {
//        // logic for authentication
//        return username.equalsIgnoreCase("Sachin") && password.equals("Sachin123");
//    }
//}
//
//public class First {
//    public static void main(String[] args) {
//        Account acc = new Account();
//        acc.setBalance(5000); // deposit money
//        acc.getBalance(500)
//    }
//}
