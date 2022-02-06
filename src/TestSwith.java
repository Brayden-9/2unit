
import java.util.Scanner;
public class TestSwith{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    System.out.println("请输入星期值");
        int week = input.nextInt();
        switch(week){
            case 1:
               System.out.println("星期一：Monday");
               break;
            case 2:
                System.out.println("星期二：Tuesday");
                break;
            case 3:
                System.out.println("星期三：Wednesday");
                break;
            case 4:
                System.out.println("星期四：Thursday");
                break;
            case 5:
                System.out.println("星期五：Friday");
                break;
            case 6:
                System.out.println("星期六：Saturday");
                break;
            case 7:
                System.out.println("星期天：Sunday");
                break;
            default:
                System.out.println("非法星期值");
                break;
        }


    }
}
