import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int math = scn.nextInt();
        if(math%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
//https://blog.xuite.net/evan_0412/wretch/169912531-printf%28+%29%E7%9A%84%E4%BD%BF%E7%94%A8