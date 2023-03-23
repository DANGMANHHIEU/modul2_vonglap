import java.util.Scanner;

public class uocchungmax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.println("enter number a");
        a = scanner.nextInt();
        System.out.println("enter number b");
        b = scanner.nextInt();
        // trả về giá trị tuyệt đối a và b
        a = Math.abs(a);
        b = Math.abs(b);

        if(a==0 || b==0){
            System.out.println("ko có ước chung lớn nhất");
        }else{
            while(a!=b){
                if(a > b){
                    a = a -b;
                }else{
                    b=b-a;
                }
            }
            System.out.println("ucln: "+ a);
        }

    }

}
