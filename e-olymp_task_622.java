import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        String str = sc.nextLine();
        int num = Integer.parseInt(str);
        str = "";
        while (num > 1) {
            if (num % 2 == 1) {
                str = "1" + str;
                counter = counter + 1;
            } else {
                str = "0" + str;
            }
            num = num / 2;
        }
        System.out.println(counter+1);
    }
}
