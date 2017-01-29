import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int width = Integer.parseInt(str.substring(0, str.indexOf(' ')));
        int height = Integer.parseInt(str.substring(str.indexOf(' ')+1, str.length()));
        String firstStr = "";
        String secondStr = "";
        for (int i = 0; i < height; i++) {
            firstStr = firstStr + sc.next();
        }
        for (int i = 0; i < height; i++) {
            secondStr = secondStr + sc.next();
        }
        String truthTable = sc.next();
        String outputStr = "";
        String logicalOperation = "";
        String logicalResult = "";
        for (int i = 0; i < height*width; i++) {
            logicalOperation = firstStr.substring(i, i+1) + secondStr.substring(i, i+1);
            switch (logicalOperation) {
                case "00": logicalResult = truthTable.substring(0,1); break;
                case "01": logicalResult = truthTable.substring(1,2); break;
                case "10": logicalResult = truthTable.substring(2,3); break;
                case "11": logicalResult = truthTable.substring(3,4); break;
            }
            outputStr = outputStr + logicalResult;
        }
        for (int i = 0; i < height; i++) {
            System.out.println(outputStr.substring(0, width));
            outputStr = outputStr.replaceFirst(outputStr.substring(0, width), "");
        }
    }
}
