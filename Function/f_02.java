import java.util.Scanner;

public class f_02 {
    public static int product(int a,int b){
        int product = a*b;
        return product;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int product = product(a, b);
        System.out.println(product);
    }
}
