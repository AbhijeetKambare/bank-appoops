import java.util.Objects;
import java.util.UUID;

public class SBIUser implements bankInterface {
    //attributes
    private String name;
    private String accoontNo;
    private double balance;
    private String password;
    private double rateOfInterest;

    public SBIUser(String name, double balance, String password) {
        //this we will provide
        this.name = name;
        this.balance = balance;
        this.password = password;


        //bank case intialize
        this.rateOfInterest=6.5;
       //this will genrate  unique random number
        this.accoontNo=String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccoontNo() {
        return accoontNo;
    }

    public void setAccoontNo(String accoontNo) {
        this.accoontNo = accoontNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public double checkBalance() {
        return this.balance;
    }

    @Override
    public String addMoney(int amount) {
        balance=balance+amount;
        return "amount credited in your account:"+amount+"and the current balance is"+balance;
    }

    @Override
    public String withdrawMoney(int amount, String entredPassword) {
        if(Objects.equals(entredPassword,password)){
            if(amount>balance){
                return "Insufficint amount";
            }
            else {
                balance=balance-amount;
                return amount+" amouunt is debited from your bank account remaining balance is :"+balance;
            }
        }
        else {
            return "Invalid User";
        }
    }

    @Override
    public double calculateInterest(int years) {
        return (balance*years*rateOfInterest)/100;
    }
}
