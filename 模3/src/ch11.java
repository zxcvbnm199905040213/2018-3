import java.util.Scanner;

public class ch11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        System.out.println(fun(a));
    }
    public static int fun(int n){
        if (n==1 || n==0){
            return n+1;
        }else {
           return fun(n-1)+fun(n/2);
        }
    }
}
