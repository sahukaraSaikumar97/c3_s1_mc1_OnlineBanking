import java.util.Random;

public class OnlineBanking {
    String accountType;
    String accountHolderName;
    long AccountNumber;
    public int accNumberGen(){
        Random random = new Random();
        int num = 0;
        for(int i = 0;i<12;i++) {
            num=random.nextInt(9);
            System.out.print(num);
        }
        return num;
    }
    public double checkBalance(){
       double balance = 0.0;
        return balance;
    }
    public double debitCash(){
        double balance = 0.0;
        return balance;
    }
    public double creditCash(){
        double balance = 0.0;
        return balance;
    }
}
