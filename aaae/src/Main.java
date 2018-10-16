import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        if(x < -1){
            System.out.println(3*x*x);
        }else if(x > 1){
            System.out.println(2*x+3);
        }else{
            System.out.println(x*x*x+3*x-3);
        }
    }
}
