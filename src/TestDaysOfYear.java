//从键盘分别输入年、月、日，判断这一天是当年的第几天
import java.util.Scanner;
public class TestDaysOfYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("年：");
        int year = input.nextInt();

        System.out.print("月：");
        int month = input.nextInt();//前面11个月的总天数

        System.out.print("日");
        int day = input.nextInt();

        int days = day;

        //加前面几个月的满月天数
        switch(month){
            case 12:
                //前面11个月的总天数
                //days += 第11月的天数;
                days += 30;
            case 11:
                //前面10个月的总天数
                //days += 第10月的天数;
                days += 31;
            case 10:
                days += 30;//九月
            case 9:
                days += 31;//八月
            case 8:
                days +=31;//七月
            case 7:
                days += 30;//六月
            case 6:
                days += 31;//五月
            case 5:
                days += 30;//四月
            case 4:
                days += 31;//三月
            case 3:
                days += 28;//二月
             /*if(闰年）{
             days++;
             }
              */
                if(year % 4==0 && year%100 != 0 || year % 400 == 0){
                    days++;
                }
            case 2:
                days+=31;//一月
        }
        System.out.println(year +"年"+month+"月"+ day +"日是这一年的第"+days+"天");
    }
}
