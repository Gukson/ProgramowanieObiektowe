package snipped.lista3;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner userInterface = new Scanner(System.in);
        int N = userInterface.nextInt();
    }
    public static int fibbR(int n){
        if(n<3) return 1;
        return fibbR(n-2)+ fibbR(n-1);
    }
    public static void print_triangle(int N){

//        for(int x = 0; x<N;x++){
//
//        }
    }
}
