import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("上次的分数是:");
        Scanner sc = new Scanner(System.in);
        double last = sc.nextDouble();
        System.out.print("这次的分数是:");
        double now = sc.nextDouble();
        Sore xiaoming_sore = new Sore(last,now);
        xiaoming_sore.change();

    }
}