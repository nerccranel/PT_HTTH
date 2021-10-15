 import java.io.BufferedReader;
import java.io.FileReader;
public class FileTReader {
   




    public void run(){
        try {
            
            FileReader fr = new FileReader("text.txt");
           BufferedReader br = new BufferedReader(fr);

        String line;
        while((line=br.readLine())!= null){
            System.out.println(line);
            Thread.sleep(2000);
        }

            fr.close();
            br.close();
            
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
public static void main(String[] args) {
    FileTReader t1 = new FileTReader("text.txt");
    t1.start();
    System.out.println("done");

}
}

    


