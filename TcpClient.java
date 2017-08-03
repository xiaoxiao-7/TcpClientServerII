import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by _xiaoxiao7 on 2017/8/4.
 */
public class TcpClient {
    public static void main(String args[]) throws Exception {
        Socket s = new Socket("127.0.0.1", 56666);
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        Thread.sleep(30000);
        dos.writeUTF("Hello server");
        dos.flush();
        dos.close();
        s.close();
    }
}
