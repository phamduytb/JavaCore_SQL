package nsotien.entity;

public class Main {
    public static void main(String[] args) {
        int a1 = HinhVuongChuVi.chuVi(5);
        int a2 = HinhVuongChuVi.dienTich(5);
        double a3 = HinhTron.chuVi(5);
        double a4 = HinhTron.dienTich(5);
        double a5 = TamGiacVuong.chuVi(3, 4, 5);
        int a6 = TamGiacVuong.dienTich(3, 4, 5);
        int a7 = ChuNhat.chuVi(6, 7);
        int a8 = ChuNhat.dienTich(6, 7);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);
        System.out.println(a7);
        System.out.println(a8);


    }
}
