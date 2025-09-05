import java.util.Scanner;

public class f_01 {
    public static int sum(int a,int b){
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int sum = sum(a, b);
        System.out.println(sum);
    }
}
