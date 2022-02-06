/*
赌数游戏
提供三个1-6的随机数，作为掷骰子得到的点数。如果各个点数相同，则为豹子。
如果三个骰子点数和，小于或等于9，则为“小”。
如果三个骰子点数和，大于9，则为“大”。
用户随机选择：押大、押小或者押豹子。通过判断，输出客户是否押正确。
 */
import java.util.Scanner;
public class GuessNumber {
     public static void main(String[] args){
         //1、产生一个[1-6]的数
         int a = (int)(Math.random()*6 + 1);
         //System.out.println(a);
         int b = (int)(Math.random()*6 + 1);
         //System.out.println(b);
         int c = (int)(Math.random()*6 + 1);
         //System.out.println(c);

         String result = "";
         if(a==b && b ==c){
             result = "豹子";
         }else if(a+b+c < 9){
             result = "小";
         }else{
             result = "大";
         }

         //2、用户输入猜的结果
         Scanner input = new Scanner(System.in);
         System.out.print("请压宝，买定请离手；选择（大，小，豹子)");
         String guss = input.next();

         //3、判断结果
         if(result.equals(guss)){
             System.out.println("猜对了");
         }else{
             System.out.println("猜错了");
         }

}
}
