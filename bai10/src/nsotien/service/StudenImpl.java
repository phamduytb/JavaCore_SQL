package nsotien.service;

import nsotien.model.cau3.Address;
import nsotien.model.cau3.School;
import nsotien.model.cau3.Student;

import java.util.Scanner;

public class StudenImpl implements  StudentService {
    @Override
    public void input(Student st) {
        System.out.println("id :");
        st.setId(new Scanner(System.in).nextInt());
        System.out.println("name :");
        st.setName(new Scanner(System.in).nextLine());
        System.out.println("age :");
        st.setAge(new Scanner(System.in).nextInt());
        School ss = new School();
        st.setSchool(ss);
        SchoolImpl si = new SchoolImpl();
        si.input(st.getSchool());

        Address aa = new Address();
        st.setAddress(aa);
        AddressImpl ai = new AddressImpl();
        ai.input(st.getAddress());

    }

    @Override
    public void output(Student st) {
        System.out.println("information >>>>>");
        System.out.println("id = " + st.getId());
        System.out.println("name = " + st.getName());
        System.out.println("age = " + st.getAge());
        if (st.getSchool() != null  ) {
            SchoolImpl s2 = new SchoolImpl();
            s2.output(st.getSchool());
        }
        if (st.getAddress() != null  ) {
            AddressImpl a2 = new AddressImpl();
            a2.output(st.getAddress());
        }
    }
}
