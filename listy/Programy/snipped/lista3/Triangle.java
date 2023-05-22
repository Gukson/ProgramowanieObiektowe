package snipped.lista3;

public class Triangle {
    public static void main(String[] args) {
        print_triangle(4);

    }
    public static int fibb(int n, int k){
        if(k == 0 || k == n) return 1;
        return fibb(n-1, k-1) + fibb(n-1,k);
    }

    public static void generate_numbers(int N, int tab[]){
        int k = 0;
        for(int x = 0; x<N;x++){
            for(int y = 0;y<=x;y++) {
                tab[k] = fibb(x, y);
                k++;
            }
        }
    }

    public static void print_triangle(int N){
        int [] liczby = new int[1000];
        generate_numbers(N,liczby);

        int k = 0;
        for(int x = 0; x<N;x++){
            for(int y=0;y<(N-x)*2;y++) System.out.print("0");
            for(int y = 0;y<=x;y++) {
                System.out.print("00"+liczby[k] );
                k++;
            }
            System.out.println();
        }
    }
}
