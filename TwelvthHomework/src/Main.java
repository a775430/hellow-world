import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        int z = scn.nextInt();
        if(x >= y && x >= z && y >= z){
            System.out.println(x);
            System.out.println(z);
        }else if(x >= y && x >= z){
            System.out.println(x);
            System.out.println(y);
        }else if(y >= x && y >= z && x >= z){
            System.out.println(y);
            System.out.println(z);
        }else if(y >= x && y >= z){
            System.out.println(y);
            System.out.println(x);
        }else if(z >= x && x >= y) {
            System.out.println(z);
            System.out.println(y);
        }else{
            System.out.println(z);
            System.out.println(x);
        }
    }
}
