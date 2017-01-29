import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Task11 starter = new Task11();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int firstNum = Integer.parseInt(str.substring(0, str.indexOf(' ')));
        int secondNum = Integer.parseInt(str.substring(str.indexOf(' ')+1, str.length()));;
        String firstNumString = "";
        String secondNumString = "";
        while (firstNum > 0) {
            if (firstNum%2!=0){
                firstNumString = "1" + firstNumString;
            }
            else {
                firstNumString = "0" + firstNumString;
            }
            firstNum = firstNum/2;
        }
        while (secondNum > 0) {
            if (secondNum%2!=0){
                secondNumString = "1" + secondNumString;
            }
            else {
                secondNumString = "0" + secondNumString;
            }
            secondNum = secondNum/2;
        }
        String xorResult = "";
        int counter = 1;
        int length1 = firstNumString.length();
        int length2 = secondNumString.length();
        int max = length1;
        if (length2 > length1) max = length2;
        counter = 0;
        while (counter < Math.abs(length1-length2)) {
            if (length1>length2) {
                secondNumString = "0" + secondNumString;
            } else firstNumString = "0" + firstNumString;
            counter = counter + 1;
        }
        counter = max-1;
        while (counter >= 0){
            if ((firstNumString.charAt(counter) == '1' &
                    secondNumString.charAt(counter) == '1') |
                    (firstNumString.charAt(counter) == '0' &
                            secondNumString.charAt(counter) == '0')) {
                xorResult =  "0" + xorResult;
            } else {
                xorResult = "1" + xorResult;
            }
            counter = counter - 1;
        }
        System.out.println(Integer.parseInt(xorResult,2));
    }
}
