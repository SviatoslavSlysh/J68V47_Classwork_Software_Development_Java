import java.util.Scanner;
//Exercise 3
public class inclass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int count = 0; count < 10; count++) {
            String[] question = {"2+2?", "3+3", "4+4", "5+5","6+6","7+7?", "8+8", "9+9", "10+10"};
            Integer[] answer = {4, 6, 8, 10, 12, 14, 16, 18, 20};
            System.out.printf(question[count]);
            int resp = input.nextInt();
            if (resp == answer[count]){
                System.out.println("Your answer is correct");
            }else {
                System.out.println("Wrong answer");
            }
        }
    }
}



//Exercise 2
//public class inclass {
//    public static void main(String[] args) {
//        for( int count=10; count>=1; count-- )
//        {
//            System.out.println(count);
//        }
//        System.out.println("blastoff !!!!!!!");
//    }}
//
//
//Exercise 1
//public class inclass {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.printf("Enter your number: ");
//        int Ask = input.nextInt();
//        for( int count=1; count<=12;count++ )
//        {
//            System.out.println(Ask*count);
//        }
//    }}