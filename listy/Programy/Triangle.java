import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner userInterface = new Scanner(System.in);
        final int N = userInterface.nextInt();
        print_triangle(N);
    }
    public static int fibb(int n, int k){
        if(k == 0 || k == n) return 1;
        return fibb(n-1, k-1) + fibb(n-1,k);
    }

    public static void print_triangle(int N){
        int [][] pascal = new int [N*2 + 1][N*2 + 1];
        for(int x = 0; x<N;x++){
            int temp = 0;
            for(int y=0;y<(N-x)-1;y++,temp++) pascal[x][temp] = 0;
            for(int y = 0;y<=x;y++, temp+=2) {
                pascal[x][temp]= 0;
                pascal[x][temp+1] = fibb(x, y);
            }
        }
        for(int x = 0; x<N;x++){
            for(int y = 0; y<N*2 + 1;y++){
                System.out.print(pascal[x][y] + " ");
            }
            System.out.println();
        }
    }
}
