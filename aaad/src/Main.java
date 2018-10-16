import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        if(x==1000){
            System.out.println("1 thousand 0 hundred 0 ten 0 dollar");
        }else {
            System.out.print(x / 100 + "hundred");
            System.out.print(x % 100 / 10 + "ten");
            System.out.println(x % 100 % 10 + "dollar");
        }
    }
}
