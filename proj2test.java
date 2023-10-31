package testjava;
import java.util.Scanner;
public class proj2test { 
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] ms = new int[n];
        for (int i=0; i<n; i++) {
            ms[i] = in.nextInt();
        }
        for (int a: ms) {
            System.out.println(a);
        }
    }
}
