//Exercise 1

import java.util.Scanner;
//
//public class asking {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your name: ");
//        String name = input.nextLine();
//        Scanner input1 = new Scanner(System.in);
//        System.out.println("Enter your surname: ");
//        String surname = input1.nextLine();
//        Scanner input2 = new Scanner(System.in);
//        System.out.println("Enter your date of birth: ");
//        int year = input2.nextInt();
//        Scanner input3 = new Scanner(System.in);
//        System.out.println("Enter your login: ");
//        String login = input3.nextLine();
//        Scanner input4 = new Scanner(System.in);
//        System.out.println("Enter your password: ");
//        String password = input4.nextLine();
//
//        String capitalizeStr = login.substring(0,1).toUpperCase() + login.substring(1).toLowerCase();
//        System.out.println(capitalizeStr);
//        String capitalizeStr2 = password.substring(0,1).toLowerCase() + login.substring(1).toUpperCase();
//        System.out.println(capitalizeStr2);
//
//    }
//}


//Exercise 2

//public class asking {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("What is Capital of Spain? : ");
//        String capitalofSpain = "Madrid";
//        String capitalofSpain1 = input.nextLine();
//        boolean isMadrid = capitalofSpain.toLowerCase().contains(capitalofSpain1.toLowerCase());
//        System.out.println(isMadrid);
//
//        Scanner input2 = new Scanner(System.in);
//        System.out.println("What is Capital of England? : ");
//        String capitalofEngland = "London";
//        String capitalofEngland1 = input2.nextLine();
//        boolean isEngland = capitalofEngland.toLowerCase().contains(capitalofEngland1.toLowerCase());
//        System.out.println(isEngland);
//
//
//        Scanner input3 = new Scanner(System.in);
//        System.out.println("What is Capital of Italy? : ");
//        String capitalofItaly = "Rome";
//        String capitalofItaly1 = input3.nextLine();
//        boolean isItaly = capitalofItaly.toLowerCase().contains(capitalofItaly1.toLowerCase());
//        System.out.println(isItaly);
//
//    }
//}



//Exercise 3



//public class asking {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the loan amount: £");
//        double loanAmount = input.nextDouble();
//        System.out.print("Enter the annual interest rate (in percentage): ");
//        double annualInterestRate = input.nextDouble();
//        System.out.print("Enter the number of years for the loan: ");
//        int loanDurationYears = input.nextInt();
//        double monthlyInterestRate = (annualInterestRate / 100) / 12;
//        int loanMonths = loanDurationYears * 12;
//        double monthlyPayment = loanAmount * (monthlyInterestRate / (1 - Math.pow(1 + monthlyInterestRate, -loanMonths)));
//        System.out.printf("Your monthly payment will be: £%.2f%n", monthlyPayment);
//    }
//}

public class asking {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter your surname: ");
        String surname = input1.nextLine();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the total value of your order: ");
        float value = input2.nextFloat();
        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter the amount you wish to pay as deposit: ");
        float amount = input3.nextFloat();
        System.out.println("== Receipt  ==");
        System.out.println("Customer: " + name.substring(0,1).toUpperCase() + " " +surname);
        System.out.println("Order Total: " + value);
        System.out.println("Deposit Paid: " + amount);
        float remainder = value - amount;
        System.out.println("Remainder: " + remainder);
        System.out.println("You get a free toaster!\nHave a nice day!");


    }
}