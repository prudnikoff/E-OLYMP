import java.util.HashMap;
import java.util.Scanner;

class Task_false1 {
    static HashMap<Character, Integer> map = new HashMap<Character,Integer>();
    static HashMap<Integer, Character> map2 = new HashMap<Integer,Character>();
    static int toDecimal(String num, int base) {
        int power = 0;
        int result = 0;
        for (int i = num.length() - 1; i >= 0; i-- ) {
            int digit = 0;
            if (map.containsKey(num.charAt(i))) {
                digit = map.get(num.charAt(i));
            } else digit = Integer.parseInt(num.charAt(i) + "");
            int addiction = digit * (int)Math.pow(base, power);
            result = result + addiction;
            power++;
        }
        return result;
    }
    public static void main(String[] args) {
        for (int i = 65; i < 91; i++) {
            map.put((char)i, i - 55);
        }
        for (int i = 65; i < 91; i++) {
            map2.put(i - 55, (char)i);
        }
        Scanner sc = new Scanner(System.in);
        String[] bases = sc.nextLine().split(" ");
        String  input = sc.nextLine();
        int decimalEquivalent = toDecimal(input, Integer.parseInt(bases[0]));
        String result = "";
        int divider = Integer.parseInt(bases[1]);
        while (decimalEquivalent / divider > 0) {
            int digit = decimalEquivalent % divider;
            if (digit > 9) {
                result = map2.get(digit) + result;
            } else result = digit + result;
            decimalEquivalent = decimalEquivalent / divider;
        }
        int digit = decimalEquivalent % divider;
        if (digit > 9) {
            result = map2.get(digit) + result;
        } else result = digit + result;
        System.out.println(result);
    }
}
