/*
输出所有的水仙花数
所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。
例如： 153 = 1*1*1 + 3*3*3 + 5*5*5
 */

import java.util.Arrays;

public class ShuiXianHua {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i < 1000; i++ ){

            int j1 = 0;
            int j2 = 0;
            int j3 = 0;
            j1 = i / 100;//百位
            j2 = (i - j1 * 100) / 10;//十位
            j3 = i - j1 *100 - j2 * 10;//个位
            if (i == j1 * j1 * j1 + j2 * j2 * j2 + j3 * j3 *j3){
                 count++;
                System.out.println("此数值为满足条件的水仙花数；" + i );

            }
        }
        System.out.println("共又"+count+ "个水仙花数" );
    }
}
