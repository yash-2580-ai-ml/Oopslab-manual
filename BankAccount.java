public class BankAccount{
	protected String accountholder;
	protected double balance;
	protected int accountNumber;


    public BankAccount(String accountholder,int accountNumber,double balance){
        this.accountholder = accountholder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void withdrawl(double amount){
        if(amount <= balance){
            balance= balance - amount;
            System.out.println("current balance is: "+balance);
        }
        else{
            System.out.println("Current balance: "+balance);
        }
    }
    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("current balance is: "+balance);
    }
    public static void main(String[] args) {
        BankAccount BA = new BankAccount("yashaswi",123456,1000);
        BA.withdrawl(500);
        BA.deposit(1000);
    }
}