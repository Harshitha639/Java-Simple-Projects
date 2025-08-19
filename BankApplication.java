import java.util.Scanner;

public class BankApplication {
    private String name;
    private String gender;
    private int age;
    private double balance;

    static String bankName;
    static String branchName;

    public BankApplication(String name, String gender, int age, double balance) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance! Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully.");
    }

    public double calculateInterest() {
        return (balance * 9.5 * 3) / 100;
    }

    public void displayDetails() {
        System.out.println("\n--- User Details ---");
        System.out.println("Bank Name  : " + bankName);
        System.out.println("Branch Name: " + branchName);
        System.out.println("Name       : " + name);
        System.out.println("Gender     : " + gender);
        System.out.println("Age        : " + age);
        System.out.println("Balance    : " + balance);
        System.out.println("Interest for 3 years at 9.5%: " + calculateInterest());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bank Name: ");
        bankName = sc.nextLine();
        System.out.print("Enter Branch Name: ");
        branchName = sc.nextLine();
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Gender: ");
        String gender = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankApplication user = new BankApplication(name, gender, age, balance);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Withdraw Amount");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Calculate Interest");
            System.out.println("4. Display Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double wAmt = sc.nextDouble();
                    user.withdraw(wAmt);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double dAmt = sc.nextDouble();
                    user.deposit(dAmt);
                    break;
                case 3:
                    double interest = user.calculateInterest();
                    System.out.println("Interest for 3 years at 9.5%: " + interest);
                    break;
                case 4:
                    user.displayDetails();
                    break;
                case 5:
                    System.out.println("Thank you for using the bank application.");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please choose again.");
            }
        }
    }
}
