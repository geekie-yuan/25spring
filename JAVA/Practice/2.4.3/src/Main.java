import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //随机数获取 0到3
        final long l = System.currentTimeMillis();
        final int i = (int)( l % 3);

        System.out.println("石头(1)、剪刀(2)、布(3)游戏开始！");
        System.out.print("请输入你的选项：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = a - i;
        if (result == 0 ) {System.out.println("Try again");}
        else if (result == -1 || result == 2){System.out.println("You Win");}
        else if (result == 1 || result == -2){System.out.println("You Lose");}
    }
}