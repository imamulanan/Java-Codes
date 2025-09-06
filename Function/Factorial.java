/*
 * Factorial
 */

import java.util.Scanner;

public class Factorial {
    public static void Factorial(int n){
        //loop
        int fact =1;
        for(int i=n;i>=1;i--){
            fact *=i;
        }
        System.out.println(fact);
        return ;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Factorial(n);
    }
}
