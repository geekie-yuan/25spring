// 布尔运算
public class Main {
    public static void main(String[] args) {
        int age = 17;
        // primary student的定义: 6~12岁
        boolean isPrimaryStudent = (6<=age) && (age<=12);
        System.out.println(isPrimaryStudent ? "Yes" : "No");
    }
}