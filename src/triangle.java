/*
打印如下的图形：三角形
   *
   * * *
   * * * * *
   * * * * * * *
   * * * * *
   * * *
   *
 */
public class triangle {
    public static void main(String[] args){
        for(int i = 0; i < 7;i++){
            if(i <4 ){
                for (int j = 0;j < 2*i + 1;j++){
                    System.out.print("*");
                }
                System.out.println("5");
            }else{
                for(int k = 0 ;k < 13 - 2*i;k++){
                    System.out.print("*");
                }
                System.out.println("7");
            }
        }
    }

}
