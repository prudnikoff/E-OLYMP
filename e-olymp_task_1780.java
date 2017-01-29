import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;


public class Task_false1 {
    public static void main(String[] args) {
        try{
            File file1 = new File("input.txt");
            File file2 = new File("output.txt");
            PrintWriter out = new PrintWriter(file2);
            Scanner sc = new Scanner(file1);
            String strLine;
            while (sc.hasNextLine()){
                String str = sc.nextLine();
                BigInteger newNum = new BigInteger(str);
                BigDecimal num = new BigDecimal(str);
                //new num = num.toBigInteger();
                out.println(newNum.xor(newNum.divide(BigInteger.valueOf(2))));
            }
            sc.close();
            out.close();
        } catch (Exception e){
            System.out.println("Error");
        }
    }
}
