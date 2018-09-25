import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();//接收使用者輸入的數值
        int b = scn.nextInt();//接收使用者輸入的數值
        int c=a+b;
        int d=a-b;
        int e=a*b;
        float f=a/ (float)b;
        System.out.println("相加=" +c);
        System.out.println("相減=" +d);
        System.out.println("相乘=" +e);
        System.out.println("相除=" +f);
    }
}
