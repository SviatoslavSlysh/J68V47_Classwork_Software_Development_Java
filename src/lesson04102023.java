//Exercise 1
//public class lesson04102023 {
//    public static void main(String[] args) {
//        int count = 10;
//        while (count <= 24) {
//            System.out.println(count);
//            count+=2;
//        }
//    }
//}


import java.time.LocalTime;
import java.util.Scanner;

//Exercise 2
//public final class lesson04102023 {
//    public static void main(String[] args) {
//        Scanner newone = new Scanner(System.in);
//        System.out.printf("Do you want to start a programm?: ");
//        String asking = newone.nextLine();
//        while (!asking.equals("quit")) {
//            Scanner newone1 = new Scanner(System.in);
//            System.out.printf("type something:  ");
//            String askingg = newone1.nextLine();
//            if (askingg.equals("quit")) {
//                System.out.println("Okay, bye!");
//                asking = askingg;
//                break;
//            }
//            LocalTime currentTime = LocalTime.now();
//            int hour = currentTime.getHour();
//            int minute = currentTime.getMinute();
//            int second = currentTime.getSecond();
//            System.out.print("Hello\n");
//            System.out.println("Hour: " + hour + ", Minute: " + minute + ", Second: " + second);
//
//        }
//    }
//}


//Exercise 3
public class lesson04102023 {
//    public static void printmessage(){
//        System.out.printf("amazing");
//    }
        public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        int score = 3;
        for (int count = 0; count < 10; count++) {
            String[] question = {"2+2?: ", "3+3?: ", "4+4?: ", "5+5?: ", "6+6?: ", "7+7?: ", "8+8?: ", "9+9?: ", "10+10?: "};
            Integer[] answer = {4, 6, 8, 10, 12, 14, 16, 18, 20};
            System.out.printf(question[count]);
            int resp = input.nextInt();
            if (resp != answer[count]) {
                System.out.println("Wrong answer");
                score -= 1;
                System.out.format("You have  heart:%s%n ", score);
//                System.out.format("%s.......%.2f%n ", number1name, number1price);
                if (score == 0) {
                    System.out.println("Your Heart is Over.");
                    break;
                }
            } else {
                System.out.println("Your answer is correct");
//                printmessage();
            }
        }
    }
}

