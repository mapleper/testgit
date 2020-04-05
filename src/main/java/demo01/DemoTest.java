package demo01;

public class DemoTest {
    public static void main(String[] args) {
        int b=2;
        int c =show();
        System.out.println(c+b);
    }
    public static int show(){
        int a =1;
        a++;
        return a;
    }
}
