import java.util.HashMap;
import java.util.Scanner;

public class Task_false1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String str = sc.nextLine();
        String[] array = str.split(" ");
        HashMap map = new HashMap();
        for (int i = 0; i < array.length; i++) {
            int local = Integer.parseInt(array[i]);
            if (map.get(local) == null) {
                map.put(local, 1);
            } else {
                map.put(local, (int)map.get(local) + 1);
            }
        }
        int ans = 0;
        Object[] keys = map.keySet().toArray();
        for (int k = 0; k < keys.length; k++) {
            if (map.get(keys[k]).toString().equals(keys[k].toString())) {
                ans++;
            }
        }
        if (ans == 1) {
            System.out.println(ans - 1);
        } else {
            System.out.println(ans);
        }
    }
}
