public class Sore{
    //属性
    double last;
    double now;
    //构造方法
    public Sore(double last, double now){
        this.last = last;
        this.now = now;
    }
    //方法
    public void change(){
        if(now > last){
            double result = (now-last);
            System.out.printf("成绩提高了"+"%.2f"+"%%",result);
        }
        else {
            double result = (last-now);
            System.out.printf("成绩降低了"+"%.2f"+"%%",result);
        }

    }
}
