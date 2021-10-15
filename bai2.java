import java.util.Scanner;
public class bai2 {
    
    
    public static boolean snto(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= (Math.sqrt(n)); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap vao mot so");
        int n = sc.nextInt();
        
        if(snto(n)){
            System.out.println(n +" la so nguyen to");

        }
        else{
            System.out.println(n +" khong phai so nguye nto");
        }
    }
}
