import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task_false1 {
    public static void main(String[] args) {
        try{
            File file1 = new File("input.txt");
            File file2 = new File("output.txt");
            PrintWriter out = new PrintWriter(file2);
            Scanner sc = new Scanner(file1);
            String result;
            while (sc.hasNextLine()){
                String str = sc.nextLine();
                result = "";
                if (str.equals("0")) {
                    out.println("0");
                } else {
                    int num = Integer.parseInt(str);
                    while (num >= 1) {
                        if (num % 2 == 1) {
                            result = "1" + result;
                        } else result = "0" + result;
                        num = num / 2;
                    }
                    out.println(result);
                }
            }
            sc.close();
            out.close();
        } catch (Exception e){
            System.out.println("Error");
        }
    }
}

