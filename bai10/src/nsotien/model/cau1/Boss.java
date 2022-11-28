package nsotien.model.cau1;

public class Boss extends Person  {

    private int exp;

    public Boss() {
    }

    @Override
    public void salary() {
        System.out.println("trach nhiem");
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}
