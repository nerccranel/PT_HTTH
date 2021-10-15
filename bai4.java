import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
         int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++)
        {
            sum += i;
        }
        System.out.println("Tổng các số tự nhiên từ 1 đến "+ n +" là: "+sum);
 
      
    }
}