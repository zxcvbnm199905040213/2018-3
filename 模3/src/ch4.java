import java.util.Scanner;

public class ch4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String a = scn.nextLine();
        for (int i = 0 ; i<a.length()/2 ; i++){
            if (a.charAt(i) != a.charAt(a.length()-1-i)){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
