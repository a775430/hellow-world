import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int h1 = scn.nextInt();
        int m1 = scn.nextInt();
        int h2 = scn.nextInt();
        int m2 = scn.nextInt();
        int sum = (h2-h1)*60+m2-m1;
        if(h1 < 0 || h1 > 24 || h1 >= h2 || h2 >24 || m1 < 0 || m1 > 60 || m2 >60){
            System.out.println("error");
        }else if(sum < 150){
            System.out.println((sum/30)*30);
        }else if(sum < 270){
            System.out.println((sum-120)/30*40+120);
        }else{
            System.out.println((sum-240)/30*60+280);
        }
    }
}
