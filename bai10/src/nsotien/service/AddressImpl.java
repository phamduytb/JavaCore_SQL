package nsotien.service;

import nsotien.model.cau3.Address;

import java.util.Scanner;

public class AddressImpl implements AddressService {
    @Override
    public void input(Address ad) {
        System.out.println("id address :");
        ad.setId(new Scanner(System.in).nextInt());
        System.out.println("street address :");
        ad.setStreet(new Scanner(System.in).nextLine());
        System.out.println("city address :");
        ad.setCity(new Scanner(System.in).nextLine());
    }

    @Override
    public void output(Address ad) {
        System.out.println("id address =" + ad.getId());
        System.out.println("street address =" + ad.getStreet());
        System.out.println("city address =" + ad.getCity());
    }
}
