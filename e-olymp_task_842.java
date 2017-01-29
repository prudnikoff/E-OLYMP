import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int devider = 2;
        while (devider <= Math.sqrt(num)) {
            if (num % devider == 0){
                System.out.print(devider);
                num = num / devider;
                if (num > 1) System.out.print("*");
            } else devider = devider + 1;
        }
        if (num > 1) System.out.print(num);
    }
}
