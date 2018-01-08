import java.util.Scanner;

public class ch5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String a =scn.nextLine();
        int[] d = new int[52];
        String[]f=a.split("");
        System.out.println(f.length);
        for (int i = 0 ; a.length()>i;i++){
            int c = a.charAt(i)-'a';
            if (c>=0 && 26>=c){
                d[c]++;
            }else {
                c=a.charAt(i)-'A';
                if (c>=0&&26>=c){
                    d[26+c]++;
                }
            }

        }
        for (int i = 0 ; 52>i ; i++){
            if (d[i]>0){
                if (26>i){
                    System.out.println((char)(i+97)+":"+d[i]);
                }else {
                    System.out.println((char)(i+65-26)+":"+d[i]);
                }
            }
        }
    }
}
