import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        switch(m) {
            case 1:
                System.out.print(m + "月份的英文是:January");
                break;
            case 2:
                System.out.print(m + "月份的英文是Februaray");
                break;
            case 3:
                System.out.print(m + "月份的英文是March");
                break;
            case 4:
                System.out.print(m + "月份的英文是April");
                break;
            case 5:
                System.out.print(m + "月份的英文是May");
                break;
            case 6:
                System.out.print(m + "月份的英文是June");
                break;
            case 7:
                System.out.print(m + "月份的英文是July");
                break;
            case 8:
                System.out.print(m + "月份的英文是August");
                break;
            case 9:
                System.out.print(m + "月份的英文是September");
                break;
            case 10:
                System.out.print(m + "月份的英文是October");
                break;
            case 11:
                System.out.print(m + "月份的英文是November");
                break;
            case 12:
                System.out.print(m + "月份的英文是December");
                break;
            default:
                System.out.println("月份只有1~12喔");//顯示使用者月分輸入錯誤
        }
    }
}
