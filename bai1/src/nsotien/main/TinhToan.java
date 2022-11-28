package nsotien.main;

public class TinhToan  {
    public static void main(String[] args) {
        int a = sum(4,5);
        int b = difference(4,9);
        int c = multiplication(4,6);
        double d = multiplication(4.8,6);
        int e = division(9,3);
        double f = division(9,3.5);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }



    public static int sum(int x,int y) {
        return x + y  ;
    }
    public static int difference(int x,int y) {
        return x - y  ;
    }
    public static int multiplication(int x,int y) {
        return x * y  ;
    }
    public static int division(int x,int y) {
        return x / y  ;
    }
    public static double multiplication(double x,int y) {
        return x * y  ;
    }
    public static double division(int x,double y) {
        return x / y  ;
    }

}
