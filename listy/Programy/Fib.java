public class Fib {
    public static void main(String[] args) {
        fibbI(6);
        System.out.println(fibbR(5));
    }
    public static void fibbI(int n){
        int a=0,b=1;
        for(int x = 0;x<n;x++){
            System.out.println(b);
            b+=a;
            a = b-a;
        }
    }
    
    public static int fibbR(int n){
        if(n<3) return 1;
        return fibbR(n-2)+ fibbR(n-1);
    }
}
