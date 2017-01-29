import java.io.File;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Scanner;

public class Task_false1 {
    public static void main(String[] args) {
        try{
            File file1 = new File("input.txt");
            File file2 = new File("output.txt");
            PrintWriter out = new PrintWriter(file2);
            Scanner sc = new Scanner(file1);
            while (sc.hasNextLine()){
                String str = sc.nextLine();
                String subStr = str.substring(2);
                BigDecimal output = new BigDecimal("0");
                BigDecimal divider = new BigDecimal(8);
                for (int i = 0; i < subStr.length(); i++) {
                    BigDecimal addiction = new BigDecimal(subStr.substring(i, i + 1));
                    addiction = addiction.divide(divider);
                    output = output.add(addiction);
                    divider = divider.multiply(new BigDecimal(8));
                }
                out.println(str + " [8] = " + output + " [10]");
            }
            sc.close();
            out.close();
        } catch (Exception e){
            System.out.println("Error");
        }
    }
}
