package nsotien.main;

import nsotien.model.cau2.Laptop;
import nsotien.model.cau2.LaptopServiceImpl;

public class MainLaptop {
    public static void main(String[] args) {
        Laptop lt = new Laptop();
        LaptopServiceImpl lsi = new LaptopServiceImpl();
        lsi.input(lt);
        lsi.output(lt);


    }
}
