////Exercise 1 - Short Story Generator
//
//import java.util.Scanner;
//public class J68V47Classwork {
//   public static void main(String[] args) {
//       Scanner scanner = new Scanner(System.in);
//       Scanner input = new Scanner(System.in);
//       int asd = input.nextInt();
//       String Name = scanner.nextLine();
//       String hobby = scanner.nextLine();
//       System.out.printf(asd + " " + Name + " lov " + hobby);
//   }
//}



//Exercise 2 - Operator Odyssey
//import java.util.Scanner;
//public class J68V47Classwork {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is first number? : ");
//        int number = scanner.nextInt();
//        System.out.println("What is second number? : ");
//        int number2 = scanner.nextInt();
//        System.out.println("Here is result: ");
//        int Result = number + number2;
//
//        scanner.close();
//        System.out.printf(number + "+" + number2 + "=" + Result);
//    }
//}


//Exercise 3 - Supermarket Sweep
import java.util.Scanner;
public class J68V47Classwork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of item 1: ");
        String number1name = input.nextLine();
        System.out.println("Enter the price of item 1: ");
        Scanner input2 = new Scanner(System.in);
        float number1price = input2.nextFloat();
        System.out.println("Enter the name of item 2: ");
        String number2name = input.nextLine();
        System.out.println("Enter the price of item 2: ");
        Scanner input3 = new Scanner(System.in);
        float number2price = input3.nextFloat();
        System.out.println("Enter the name of item 3: ");
        String number3name = input.nextLine();
        System.out.println("Enter the price of item 3: ");
        float number3price = input.nextFloat();

        System.out.println("NESMART");
        System.out.format("%s.......%.2f%n ", number1name, number1price);
        System.out.format("%s.......%.2f%n ", number2name, number2price);
        System.out.format("%s.......%.2f%n", number3name, number3price);


//thats with println - but above with format
//        System.out.println(number1name + ".........." + number1price);
//        System.out.println(number2name + ".........." + number2price);
//        System.out.println(number3name + ".........." + number3price);

        float result = number1price + number2price + number3price;
        System.out.println("Subtotal:" + result);
    }

    }
