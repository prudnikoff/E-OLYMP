import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int counter = 0;
        int toReplace;
        double logNum = Math.log10(2); // log10(2) = ln(2)/ln(10)
        while (input.length() != 0) {
            counter = counter + 1;
            toReplace = (int)(logNum*counter);
            toReplace = toReplace + 1;
            input = input.replaceFirst(input.substring(0, toReplace), "");
        }
        System.out.println(counter);
    }
}
