public class zadanie20 {
    public static void main(String[] args) {
        print_even(5);
    }
    public static void print_even(int N){
        for(int x = 0; x<=N;x++){
            if(x%2 == 0){
                System.out.println("x = " + x);
            }
        }
    }
}
