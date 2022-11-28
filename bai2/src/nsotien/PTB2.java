package nsotien.baitap;

public class PTB2 {
    public static void main(String[] args) {
        pTB2(1,2,1);
    }
// 25 -  = 8
    public static double pTB2(double a, double b, double c) {
        if (a != 0) {
            double delta = b * b - 4 * a * c;

            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / 2 * a;
                double x2 = (-b - Math.sqrt(delta)) / 2 * a;
                System.out.println(x1);
                System.out.println(x2);
            } else if (delta == 0){
                double x  = -b/(a*2) ;
                System.out.println("x1=x2= " + x);
            } else {
                System.out.println("PT vo nghiem");
            }

        } else if (a == 0) {
            System.out.println("x = " + (-c / b));
        } else {
            System.out.println("null");
        }


        return a;
    }

}
