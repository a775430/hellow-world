import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入攝氏溫度(中間用空格區別)");//讓使用者輸入的地方，中間用空格區隔
        int c = scn.nextInt();//接收使用者輸入的數值
        float f=c*5/9+32;
        System.out.println("華氏溫度="+f+"\t度");
        System.out.println("攝氏溫度=" +c+"度");
    }
}
