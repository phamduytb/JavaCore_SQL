package nsotien.model.cau1;

public class Employee extends Person  {

    private double payroll;

    public Employee() {
    }

    @Override
    public void salary() {
        setPayroll(5_000_000);
        System.out.println(getPayroll());
    }

    public double getPayroll() {
        return payroll;
    }

    public void setPayroll(double payroll) {
        this.payroll = payroll;
    }
}
