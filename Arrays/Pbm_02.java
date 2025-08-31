import java.util.Scanner;

public class Pbm_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int n[]=new int[size];

        for(int i=0;i<size;i++){
            n[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++){
            System.out.println(n[i]);
        }
    }
}
