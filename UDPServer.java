import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer{
    public final static int serverPort =7;
    public static void main(String[] args) {
        try{
            DatagramSocket ds = new DatagramSocket(serverPort);
            System.out.println("server created ...");
            byte[] buffer = new byte[6000];
            while(true){
                DatagramPacket incoming = new DatagramPacket(buffer, buffer.length);
                ds.receive(incoming);//cho nhan goi tin den
                
                String theString =new String(incoming.getData(),0,incoming.getLength());
                DatagramPacket outsending = new DatagramPacket(theString.getBytes(),incoming.getLength(),incoming.getAddress(),incoming.getPort());
                ds.send(outsending);
            
            }
        }catch(IOException ie){
            System.out.println(ie);
        }
    } 
}
