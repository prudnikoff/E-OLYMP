import java.math.BigInteger;
import java.util.Scanner;
public class Task_false1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArray = sc.nextLine().split(" ");
        BigInteger first = new BigInteger(strArray[0]);
        int second = Integer.parseInt(strArray[1]);
        BigInteger third = new BigInteger(strArray[2]);
        System.out.println(first.pow(second).mod(third));
    }
}
