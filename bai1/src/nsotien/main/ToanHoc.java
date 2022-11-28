package nsotien.main;

public class ToanHoc {
    public static void main(String[] args) {
        int h = tong(4, 5);
        hieu(3,5);
        System.out.println(h);
    }
    public static int tong(int x, int y) {
        return x+ y;
    }

    public static double tong(double x, int y) {
        return x+ y;
    }
    public static void hieu(int x, int y) {
        int hieu = x - y;
        System.out.println(hieu);
    }
}
