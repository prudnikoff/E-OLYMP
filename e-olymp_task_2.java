import java.io.DataInputStream;
import java.io.InputStream;
//class for fast scanning
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

    public String next() {
        StringBuilder ret =  new StringBuilder();
        byte c = read();
        while (c <= ' ') c = read();
        do {
            ret = ret.append((char)c);
            c = read();
        } while (c > ' ');
        return ret.toString();
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
//solution
public class Task_false1 {
    public static void main(String[] args) {
        Parser sc = new Parser(System.in);
        System.out.println(sc.next().length());
    }
}
