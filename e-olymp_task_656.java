import java.io.DataInputStream;
import java.io.InputStream;
import java.util.HashMap;

class Parser {
    final private int BUFFER_SIZE = 1 << 16;
    private DataInputStream din;
    private byte[] buffer;
    private int bufferPointer, bytesRead;

    public Parser(InputStream in) {
        din = new DataInputStream(in);
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead =  0;
    }
    public int nextInt() {
        int ret =  0;
        boolean neg;
        try {
            byte c = read();
            while (c <= ' ')
                c = read();
            neg = c == '-';
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
                c = read();
            } while (c > ' ');

            if (neg) return -ret;
        } catch (Exception e) {}
        return ret;
    }
    private void fillBuffer() {
        try {
            bytesRead = din.read(buffer, bufferPointer =  0, BUFFER_SIZE);
        } catch (Exception e) {}
        if (bytesRead == -1) buffer[ 0] = -1;
    }

    private byte read() {
        if (bufferPointer == bytesRead) fillBuffer();
        return buffer[bufferPointer++];
    }
}

public class Task_false1 {
    static int usersNum;
    static HashMap map = new HashMap();
    static boolean findWinner(int num) {
        if (map.containsKey(num)) {
            return (boolean)map.get(num);
        }
        boolean flag = false;
        for (int i = 2; i < 10; i++) {
            if (num*i >= usersNum || !findWinner(num*i)) {
                flag = true;
                break;
            }
        }
        map.put(num, flag);
        return flag;
    }

    public static void main(String[] args) {
        Parser sc = new Parser(System.in);
        usersNum = sc.nextInt();
        if (findWinner(1)) {
            System.out.println("Stan wins.");
        } else System.out.println("Ollie wins.");
    }
}
