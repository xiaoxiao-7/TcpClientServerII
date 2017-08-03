import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by _xiaoxiao7 on 2017/8/4.
 */
public class TcpServer {
    public static void main(String args[]) throws IOException {
        ServerSocket ss = new ServerSocket(56666);
        while (true) {
            Socket s = ss.accept();
            System.out.println("a new connection start");
            InputStream is = s.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            System.out.println(dis.readUTF());
            dis.close();
            s.close();
        }

    }
}
