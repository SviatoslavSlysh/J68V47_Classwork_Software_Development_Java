//import java.util.Scanner;
//Exercise 1


//public class week4 {
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your name: ");
//        String name = input.nextLine();
//        Scanner input1 = new Scanner(System.in);
//        System.out.println("Enter your surname: ");
//        String surname = input1.nextLine();
//        Scanner input2 = new Scanner(System.in);
//        System.out.println("Enter the total value of your order: ");
//        float value = input2.nextFloat();
//        Scanner input3 = new Scanner(System.in);
//        System.out.println("Enter the amount you wish to pay as deposit: ");
//        float amount = input3.nextFloat();
//        System.out.println("== Receipt  ==");
//        System.out.println("Customer: " + name.substring(0,1).toUpperCase() + " " +surname);
//        System.out.println("Order Total: " + value);
//        System.out.println("Deposit Paid: " + amount);
//        float remainder = value - amount;
//        System.out.println("Remainder: " + remainder);
//        System.out.println("You get a free toaster!\nHave a nice day!");
//
//
//    }
//}

//Exercise 2


//public class week4 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("What is Capital of Spain? : ");
//        String capitalofSpain = "Madrid";
//        String capitalofSpain1 = input.nextLine();
//        boolean isMadrid = capitalofSpain.toLowerCase().contains(capitalofSpain1.toLowerCase());
////        System.out.println(isMadrid);
//        if (isMadrid) {
//            System.out.println("Yes is it correct");
//        } else {
//            System.out.println("No. Capital of Spain - Madrid");
//        }
//
//        Scanner input2 = new Scanner(System.in);
//        System.out.println("What is Capital of England? : ");
//        String capitalofEngland = "London";
//        String capitalofEngland1 = input2.nextLine();
//        boolean isEngland = capitalofEngland.toLowerCase().contains(capitalofEngland1.toLowerCase());
////        System.out.println(isEngland);
//        if (isEngland) {
//            System.out.println("Yes is it correct");
//        } else {
//            System.out.println("No. Capital of England - London");
//        }
//
//
//
//        Scanner input3 = new Scanner(System.in);
//        System.out.println("What is Capital of Italy? : ");
//        String capitalofItaly = "Rome";
//        String capitalofItaly1 = input3.nextLine();
//        boolean isItaly = capitalofItaly.toLowerCase().contains(capitalofItaly1.toLowerCase());
////        System.out.println(isItaly);
//        if (isItaly) {
//            System.out.println("Yes is it correct");
//        }else{
//            System.out.println("No. Capital of Italy - Rome");
//        }
//
//    }
//}
//Exercise 3


//public class week4 {
//    public static void main(String[] args) {
//        int delivery = 10;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your total purchase amount: ");
//        int sum = input.nextInt();
//        System.out.format("Shipping cost is:%s\n ", delivery);
//        if (sum < 50) {
//            System.out.println("Your Final total is: " + (sum+delivery));
//        } else {
//            System.out.println("You have free delivery");
//        }
//
//    }
//}