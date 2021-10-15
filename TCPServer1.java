
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;



public class TCPServer1 {

   public final static int serverPort = 7;
    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(serverPort);
            System.out.println("Server song song da duoc tao");
            while(true){
                try{
                    Socket s = ss.accept();
                    RequestProcessing rp = new RequestProcessing(s);
                   rp.start();
                
                }catch(IOException ie1){
                System.out.println("connect error"+ie1);
                }
            }
        }catch(IOException iE)
        {
            System.out.println("Server create error "+iE);
        }
    }
}
