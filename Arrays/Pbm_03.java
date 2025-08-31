/*
   Linear search 
 * Found a number
 */

import java.util.Scanner;

public class Pbm_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int n[]=new int[size];

        for(int i=0;i<size;i++){
            n[i]=sc.nextInt();
        }

        int x = sc.nextInt();

        for(int i=0;i<n.length;i++){  //n.length and size is same
            if (n[i]==x) {
                System.out.println("x found at index: "+ i);
            }
        }
    }
}
