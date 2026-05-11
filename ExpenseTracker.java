import java.util.ArrayList;
import java.util.Scanner;

class Expense {
    String name;
    double amount;

    Expense(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }
}

public class ExpenseTracker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Expense> expenses = new ArrayList<>();

        int choice;

        do {
            System.out.println("\nExpense Tracker");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. View Total");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter expense name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter amount: $");
                    double amount = scanner.nextDouble();

                    expenses.add(new Expense(name, amount));

                    System.out.println("Expense added.");
                    break;

                case 2:
                    System.out.println("\nExpenses:");

                    for (Expense expense : expenses) {
                        System.out.println(expense.name + " - $" + expense.amount);
                    }
                    break;

                case 3:
                    double total = 0;

                    for (Expense expense : expenses) {
                        total += expense.amount;
                    }

                    System.out.println("Total Expenses: $" + total);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
