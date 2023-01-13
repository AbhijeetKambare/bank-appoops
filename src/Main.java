import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre name , password and amount to crete account");

        //create user
        String name=sc.next();
        String password=sc.next();
        double balance=sc.nextDouble();
        SBIUser user=new SBIUser(name,balance,password);

        //adding amount
        String massage= user.addMoney(500);
        System.out.println(massage);

        System.out.println("Entre amount you want  to withdraw");
        int money=sc.nextInt();
        System.out.println("enter your password");
        String pass=sc.next();
        System.out.println(user.withdrawMoney(money,pass));

        //calculate intereest
        System.out.println(user.calculateInterest(5));
    }
}