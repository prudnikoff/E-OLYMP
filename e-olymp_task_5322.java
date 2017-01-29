import java.util.Scanner;

class Task_false1 {
    String toSixteenNum(String bin) {
        int power = 0;
        int sixteenNum = 0;
        for (int i = bin.length() - 1; i >= 0; i-- ) {
            sixteenNum = sixteenNum + Integer.parseInt(bin.charAt(i)+"") * (int)Math.pow(2, power);
            power++;
        }
        switch (sixteenNum) {
            case 10: return "A";
            case 11: return "B";
            case 12: return "C";
            case 13: return "D";
            case 14: return "E";
            case 15: return "F";
            default: return sixteenNum + "";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int sixteenNum = 0;
        int counter = 0;
        String output = "";
        Task_false1 starter = new Task_false1();
        while (true) {
            if (str.length() > 4) {
                output = starter.toSixteenNum(str.substring(str.length() - 4)) + output;
                str = str.substring(0, str.length() - 4);
            } else {
                output = starter.toSixteenNum(str) + output;
                break;
            }
        }
        System.out.println(output);
    }
}
