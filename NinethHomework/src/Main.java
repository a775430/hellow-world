import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int d = scn.nextInt();
        String s = null; // 用以儲存星座名
        switch (m) { // 以月份為 switch 判斷式
            case 1:
                if (d >= 1 && d <= 19) s = "摩羯座";
                if (d >= 20 && d <= 31) s = "水瓶座";
                break;
            case 2:
                if (d >= 1 && d <= 18) s = "水瓶座";
                if (d >= 19 && d <= 29) s = "雙魚座";
                break;
            case 3:
                if (d >= 1 && d <= 20) s = "雙魚座";
                if (d >= 21 && d <= 31) s = "牡羊座";
                break;
            case 4:
                if (d >= 1 && d <= 19) s = "牡羊座";
                if (d >= 21 && d <= 30) s = "金牛座";
                break;
            case 5:
                if (d >= 1 && d <= 20) s = "金牛座";
                if (d >= 21 && d <= 31) s = "雙子座";
                break;
            case 6:
                if (d >= 1 && d <= 21) s = "雙子座";
                if (d >= 22 && d <= 30) s = "巨蟹座";
                break;
            case 7:
                if (d >= 1 && d <= 22) s = "巨蟹座";
                if (d >= 23 && d <= 31) s = "獅子座";
                break;
            case 8:
                if (d >= 1 && d <= 22) s = "獅子座";
                if (d >= 23 && d <= 31) s = "處女座";
                break;
            case 9:
                if (d >= 1 && d <= 22) s = "處女座";
                if (d >= 23 && d <= 30) s = "天秤座";
                break;
            case 10:
                if (d >= 1 && d <= 22) s = "天秤座";
                if (d >= 23 && d <= 31) s = "天蠍座";
                break;
            case 11:
                if (d >= 1 && d <= 21) s = "天蠍座";
                if (d >= 22 && d <= 30) s = "射手座";
                break;
            case 12:
                if (d >= 1 && d <= 21) s = "射手座";
                if (d >= 22 && d <= 31) s = "摩羯座";
                break;
            default:
                // 月份或日期輸入錯誤,例如2月30日、13月40日    s = "無效的輸入";  }  tfName1.setText(s);


//        if(m < 0 || m > 12 || d < 0 || d > 31){
//            System.out.println("error");
//        }else if()
        }
    }
}
