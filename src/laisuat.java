import java.util.Scanner;

public class laisuat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month;
        double money;
        double interestRate;
        System.out.println("enter month");
        month = scanner.nextInt();
        System.out.println("enter money");
        money = scanner.nextDouble();
        System.out.println("enter interestRate");
        interestRate = scanner.nextDouble();
        double totalInterest=0;
        for(int i =0;i<month;i++){
            totalInterest+= money * (interestRate/100)/12*month;
        }
        System.out.println("lai suat "+ totalInterest);
    }
}
