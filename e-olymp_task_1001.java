import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstNum = sc.next();
        String secondNum = sc.next();
        int max = firstNum.length();
        if (firstNum.length() < secondNum.length()) {
            max = secondNum.length();
        }
        int[] firstArray = new int[max];
        int[] secondArray = new int[max];
        int length1 = firstNum.length();
        int length2 = secondNum.length();
        for (int i = 1; i <= length1 ; i++) {
            firstArray[max-i] = Character.getNumericValue(firstNum.charAt(length1-i));
        }
        for (int i = 1; i <= length2 ; i++) {
            secondArray[max-i] = Character.getNumericValue(secondNum.charAt(length2-i));
        }
        int[] sum = new int[max+1];
        int counter = 1;
        int reserve = 0;
        for (int i = 1; i <= max; i++) {
            if (2 <= (firstArray[max-i] + secondArray[max-i] + reserve)) {
                sum[max-i+1] = firstArray[max-i] + secondArray[max-i] + reserve - 2;
                reserve = 1;
            } else {
                sum[max-i+1] = firstArray[max-i] + secondArray[max-i] + reserve;
                reserve = 0;
            }
        }
        if (reserve == 1) {
            sum[0] = 1;
            for (int i = 0; i < sum.length; i++) {
                System.out.print(sum[i]);
            }
        } else {
            for (int i = 1; i < sum.length; i++) {
                System.out.print(sum[i]);
            }
        }
    }
}
