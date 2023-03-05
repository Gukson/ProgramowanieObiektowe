package snipped.lista2;

import java.util.Scanner;

public class zadanie20s {
    public static void main(String[] args) {
        Scanner userInterface = new Scanner(System.in);
        int N = userInterface.nextInt();
        print_even(N);
    }
    public static void print_even(int N){
        for(int x = 0; x<=N;x++){
            if(x%2 == 0){
                System.out.println("x = " + x);
            }
        }
    }
}
