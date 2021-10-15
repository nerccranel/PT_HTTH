import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.Buffer;
import java.util.Random;

import javax.xml.crypto.Data;

public class FileTWriter extends Thread{
    String du_lieu = "Lap trinh Java can ban";




    public void run(){
        try {
            
            FileWriter fw = new FileWriter(new File("text.txt"));
           BufferedWriter bw = new BufferedWriter(fw);

           /*  for(int i=0;i<10;i++){
                int rand = (int) (Math.random() *10);
                fw.write(rand + " ");
            } */
            bw.write(du_lieu);
            bw.close();
            
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
public static void main(String[] args) {
 
    System.out.println("done");

}
}

    

