import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Account number: " );
        String accountnumber=scanner.nextLine();
        System.out.print("Account name: " );
        String name=scanner.nextLine();


        
        
        AccountDetails details = new AccountDetails(accountnumber,name,200.2);
        double withdrawal = details.withdrawl(40);
        System.out.println(withdrawal);
        double deposit = details.deposit(100);
        System.out.println(deposit);
        double balance = details.getaccount_balance();
        System.err.println(balance);

        
        
    }
    
}

class AccountDetails{
    private String account_number;
    private String account_holder_name;
    private double account_balance;
    public double balance;

    AccountDetails(String account_number, String account_holder_name, double account_balance) {
        this.account_number = account_number;
        this.account_holder_name = account_holder_name;
        this.account_balance = account_balance;
    
    }
    public void setaccount_number(String account_number) {
        this.account_number = account_number;
    }
    public void setaccount_holder_name(String account_holder_name) {
        this.account_holder_name=account_holder_name;
    }
    public void setaccount_balance(double account_balance) {
        this.account_balance=account_balance;}
    public double getaccount_balance(){
            return account_balance;
        }
    public double withdrawl(double balance){
        this.balance = balance;
        this.account_balance = this.account_balance - this.balance;
        return this.account_balance;
    }
    public double deposit(double balance){
        this.balance = balance;
        this.account_balance = this.account_balance + this.balance;
        return this.account_balance;

    }
}
