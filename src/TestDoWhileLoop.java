/*
随机生成一个100以内的数，猜数字游戏：
从键盘输入数，如果大了提示，大了，如果小了，提示小了，如果对了，就不再猜了，并统计一共猜了多少次？
提示：随机数
import java.util.Random;
Random rand = new Random();
int num= rand.nextInt(100);
 */

import java.util.Random;
import java.util.Scanner;
public class TestDoWhileLoop {
    public static void main(String[] args){
        //1、随机产生一个100以内的整数
        Random rand = new Random();
        int num = rand.nextInt(100);
        System.out.println(num);

        //键盘录入
        Scanner input = new Scanner(System.in);

        //声明变量
        int guess;
        int count = 0;
        do {
            //循环体至少执行一次
            System.out.print("请输入一个整数");
            guess = input.nextInt();//为变量赋值
            count++;//输入一次，计数一次

            if(guess>num){
                System.out.println("大了");
            }else if(guess<num){
                System.out.println("小了");
            }else {
                System.out.println("猜对了");
            }

        }while(guess != num);{
            System.out.println("一共猜了"+count +"次");
        }
    }

}
