import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numMembers;
        double[] principalAmounts;

        System.out.print("Enter the number of members: ");
        numMembers = scanner.nextInt();
        principalAmounts = new double[numMembers];

        int i = 0;
        
        while (i < numMembers) {
            System.out.print("Enter principal amount for member " + (i + 1) + ": ");
            principalAmounts[i] = scanner.nextDouble();
            i++;
        }
        double interestRate = 0.05; // 5%
        int timeFrame = 12; 
        System.out.println("Value of investment after " + timeFrame + " months:");
        i = 0;
        while (i < numMembers) {
            double investmentValue = principalAmounts[i] * Math.pow(1 + interestRate, timeFrame);
            System.out.println("Member " + (i + 1) + ": " + investmentValue);
            i++;
        }

        scanner.close();
    }
}
