//今天是周二，100天以后是周几？
public class TestExer2 {
    public static void main(String[] args) {
        int week = 2;
        week += 100;
        week = week % 7;
        System.out.println("一百天后是周" + week);
    }
}
