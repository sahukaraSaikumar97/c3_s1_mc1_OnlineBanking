import java.util.Random;

public class OnlineBanking {
    String accountType;
    String accountHolderName;
    long accountNumber;
    int age;
    String accountStatus;
    double balance;

    public void accNumberGen(){
       accountNumber = (long) (Math.random()*1000000000000L);
        System.out.println("accountNumber = " + accountNumber);
    }
    public void checkBalance(){
        System.out.println("Account balance = " + balance);
    }
    public void withdrawCash(double amount){
        if(balance > amount){
            balance =balance - amount;
            System.out.println("balance after withdraw = " + balance);
        }else {
            System.out.println("withdraw failed due to insuffient funds");
        }

    }
    public void creditCash(double creditAmount){
        balance = balance + creditAmount;
        System.out.println("balance after credit = " + balance);
    }
    public void transferCash(double transferAmount){
        if (balance> transferAmount){
            balance = balance - transferAmount;
            System.out.println("balance after transfer = " + balance);
        }else {
            System.out.println("Transfer failed due to insufficient funds");

        }

    }
    public void eligibility(){
        if (age >=18){
            System.out.println("Eligible to open an account");
        }else{
            System.out.println("You are not eligible to open an account");
            System.exit(0);
        }
    }
    public void display(){
        System.out.println("accountHolderName = " + accountHolderName);
        System.out.println("age = " + age);
        eligibility();
        accNumberGen();
        System.out.println("Opening balance = " + balance);

    }


    public static void main(String[] args) {
        OnlineBanking obj =new OnlineBanking();
        obj.accountHolderName = "Sai";
        obj.age = 11;
        obj.accountStatus = "active";
        obj.balance = 10000;
        obj.display();
        obj.withdrawCash(500);
        obj.creditCash(1000);
        obj.transferCash(1500);



    }
    
}
