package nsotien.model.cau2;

import nsotien.service.LaptopService;

import java.util.Scanner;

public class LaptopServiceImpl implements LaptopService {
    @Override
    public void input(Laptop lt) {
        System.out.println("key laptop");
        System.out.println("id :");
        lt.setId(new Scanner(System.in).nextInt());
        System.out.println("cpu :");
        lt.setCpu(new Scanner(System.in).nextLine());
        System.out.println("ram :");
        lt.setRam(new Scanner(System.in).nextInt());
        System.out.println("vga :");
        lt.setVga(new Scanner(System.in).nextLine());
    }

    @Override
    public void output(Laptop lt) {
        System.out.println("information");
        System.out.println("id = " + lt.getId());
        System.out.println("cpu = " + lt.getCpu());
        System.out.println("ram = " + lt.getRam() + "gb");
        System.out.println("vga = " + lt.getVga());
    }
}
