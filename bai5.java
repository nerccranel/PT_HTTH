import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        float tong=0;
        System.out.println("Nhap vao so phan tu cua mang");
        int n= sc.nextInt();
        float[] mang= new float[n];

        for(int i=0;i< mang.length;i++){
            System.out.print("Nhap so thu " +(i+1)+": ");
            mang[i]= sc.nextFloat();
        }

        for(int i=0;i< mang.length;i++){
            if(mang[i] >0)
            {
               tong+=mang[i];
            }
        }
        System.out.print("Tong cac so duong trong mang = " + tong);
    }
}
