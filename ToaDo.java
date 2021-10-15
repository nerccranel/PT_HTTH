import java.util.Scanner;
public class ToaDo {
    float x;
    float y;
    
    void toaDo(float x, float y){
        this.x = x;
        this.y = y;
    }
void nhaptoado(){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Nhap vao toa do x");
    float a = sc.nextFloat(); 
    System.out.println("Nhap vao toa do y");
    float b = sc.nextFloat(); 
    toaDo(a,b);
}
void intoado(){
    System.out.println("Toa do x1 la:" + x + " Toa do x2 la:" + y);
}
    public static void main(String[] args) {
        ToaDo t1 = new ToaDo();
        t1.toaDo(5, 7);
        t1.intoado();
        ToaDo t2 = new ToaDo();
        t2.nhaptoado();
        t2.intoado();
    }

}


