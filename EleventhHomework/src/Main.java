import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int d = scn.nextInt();
        if(d < 0){
            System.out.println("error");
        }else if(d <= 120){
            System.out.println((float)d*2.1);
            System.out.println((float)d*2.1);
        }else if(d <= 330){
            System.out.println((float)(d-120)*3.02+252);
            System.out.println((float)(d-120)*2.68+252);
        }else if(d <= 500){
            System.out.println((float)(d-330)*4.39+252+634.2);
            System.out.println((float)(d-330)*3.61+252+562.8);
        }else if(d <= 700){
            System.out.println((float)(d-500)*4.97+252+634.2+746.3);
            System.out.println((float)(d-500)*4.01+252+562.8+613.7);
        }else{
            System.out.println((float)(d-700)*5.63+252+634.2+746.3+994);
            System.out.println((float)(d-700)*4.5+252+562.8+613.7+802);
        }
    }
}
