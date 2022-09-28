import java.util.Scanner; // import scanner

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create a scanner

        System.out.print("Input the total bill: $");
        double totalBill = scanner.nextDouble(); // collect user input for the total bill

        System.out.print("Input the tip percentage as a whole number (without % symbol): ");
        double tipPercentage = scanner.nextDouble(); // collect user input for the tip percentage

        System.out.print("Number of people: ");
        int numberOfPeople = scanner.nextInt(); // collect user input for the number of people

        System.out.println("----------------------------");

        double totalTip = totalBill * (tipPercentage / 100); // calculate the tip
        totalBill += totalTip; // add the tip to the total bill
        double totalPerPerson = totalBill / numberOfPeople; // calculate how much each person pays

        System.out.println("After a tip of $" + String.format("%.2f", totalTip) + // print the tip
                ", the total bill is $" + String.format("%.2f", totalBill) + // print the update total bill
                "\nDivided among the " + numberOfPeople + " people, each person will pay $" + String.format("%.2f", totalPerPerson)); // print the cost per person

        scanner.close();
    }
}