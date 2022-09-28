import java.util.Scanner; // import scanner

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create a scanner

        System.out.print("Total bill: $");
        double totalBill = scanner.nextDouble(); // collect user input for the total bill

        System.out.print("Tip percentage (without % symbol): ");
        int tipPercentage = scanner.nextInt(); // collect user input for the tip percentage

        System.out.print("Number of people: ");
        int numberOfPeople = scanner.nextInt(); // collect user input for the number of people

        System.out.println("----------------------------");

        double totalTip = totalBill * (tipPercentage / 100.0); // calculate the tip
        System.out.println("The total tip amount is $" + String.format("%.2f", totalTip)); // print the tip

        totalBill += totalTip; // add the tip to the total bill
        System.out.println("The total bill is $" + String.format("%.2f", totalBill)); // print the update total bill

        double totalPerPerson = totalBill / numberOfPeople; // calculate how much each person pays
        System.out.println("The total cost per person is $" + String.format("%.2f", totalPerPerson)); // output the cost per person

        scanner.close();
    }
}