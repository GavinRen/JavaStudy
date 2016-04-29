package algorithmstudy;

/**
 * Created by bigdata on 16-4-29.
 * 递归语句
 */
public class recurision {
    /*
    * if语句后面不加直接接语句
    * 执行if语句之后不论什么情况仍然执行下一条语句
    * */
    public static void printOut(int n){
        if (n >10){
            printOut(n/10);
        }
        System.out.println(n%10);
    }
    /*
    * if语句后面加else之后只有当不满足条件时才会执行
    * */
    public static void printOut1(int n){
        if (n>10) {
            printOut1(n/10);
        }else {
            System.out.println(n%10);
        }
    }
    public static void main(String[] args) {
        printOut(762131);
        printOut1(762131);
    }
}
