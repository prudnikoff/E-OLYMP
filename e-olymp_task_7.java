import java.util.Scanner;
public class Task5 {
    int getDecimal(char chNum) {
        int num = 0;
        switch(chNum) {
            case 'I': num = 1; break;
            case 'V': num = 5; break;
            case 'X': num = 10; break;
            case 'L': num = 50; break;
            case 'C': num = 100; break;
            case 'D': num = 500; break;
            case 'M': num = 1000; break;
        }
        return num;
    }

    String getRome(int num) {
        String romeNum = null;
        switch(num) {
            case 0: romeNum = ""; break;
            case 1: romeNum = "I"; break;
            case 2: romeNum = "II"; break;
            case 3: romeNum = "III"; break;
            case 4: romeNum = "IV"; break;
            case 5: romeNum = "V"; break;
            case 6: romeNum = "VI"; break;
            case 7: romeNum = "VII"; break;
            case 8: romeNum = "VIII"; break;
            case 9: romeNum = "IX"; break;
            case 10: romeNum = "X"; break;
            case 20: romeNum = "XX"; break;
            case 30: romeNum = "XXX"; break;
            case 40: romeNum = "XL"; break;
            case 50: romeNum = "L"; break;
            case 60: romeNum = "LX"; break;
            case 70: romeNum = "LXX"; break;
            case 80: romeNum = "LXXX"; break;
            case 90: romeNum = "XC"; break;
            case 100: romeNum = "C"; break;
            case 200: romeNum = "CC"; break;
            case 300: romeNum = "CCC"; break;
            case 400: romeNum = "CD"; break;
            case 500: romeNum = "D"; break;
            case 600: romeNum = "DC"; break;
            case 700: romeNum = "DCC"; break;
            case 800: romeNum = "DCCC"; break;
            case 900: romeNum = "CM"; break;
            case 1000: romeNum = "M"; break;
            case 2000: romeNum = "MM"; break;
            case 3000: romeNum = "MMM"; break;
        }
        return romeNum;
    }

    public static void main(String[] args) {
        Task5 starter = new Task5();
        Scanner sc = new Scanner(System.in);
        char[] romeArray = sc.next().toCharArray();
        int counter = romeArray.length - 1;
        int firstNum = 0;
        int secondNum = 0;
        secondNum = starter.getDecimal(romeArray[counter]);
        while (romeArray[counter] != '+') {
            if (starter.getDecimal(romeArray[counter-1])<
                    starter.getDecimal(romeArray[counter])) {
                secondNum = secondNum - starter.getDecimal(romeArray[counter-1]);
            } else {
                secondNum = secondNum + starter.getDecimal(romeArray[counter-1]);
            }
            counter = counter - 1;
        }
        counter = counter - 1;
        firstNum = starter.getDecimal(romeArray[counter]);
        while (counter > 0) {
            if (starter.getDecimal(romeArray[counter-1])<
                    starter.getDecimal(romeArray[counter])) {
                firstNum = firstNum - starter.getDecimal(romeArray[counter-1]);
            } else {
                firstNum = firstNum + starter.getDecimal(romeArray[counter-1]);
            }
            counter = counter - 1;
        }
        int devider = 10;
        int local = 0;
        String romeSum = "";
        int decimalSum = firstNum + secondNum;
        while (decimalSum > 0) {
            local = decimalSum % devider;
            romeSum = starter.getRome(local) + romeSum;
            decimalSum = decimalSum - local;
            devider = devider*10;
        }
        System.out.println(romeSum);
    }
}
