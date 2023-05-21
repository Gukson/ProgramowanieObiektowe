package snipped.lista3;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner userInterface = new Scanner(System.in);
        int N = userInterface.nextInt();
        print_triangle(N);
    }
    public static int fibb(int n, int k){
        if(k == 0 || k == n) return 1;
        return fibb(n-1, k-1) + fibb(n-1,k);
    }
    public static void print_triangle(int N){
        for(int x = 0; x<N;x++){
            for(int y=0;y<(N-x)*2;y++) System.out.print(" ");
            for(int y = 0;y<=x;y++) System.out.print(fibb(x,y)+"   ");
            System.out.println();
        }
    }
}
