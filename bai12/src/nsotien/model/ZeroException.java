package nsotien.model;/*
java by nsotien tv .......
Name : nsotien
Time : 4:49 PM
Date : 10/25/22
*/

public class ZeroException extends Exception {
    private String eurro;

    public ZeroException(String s) {
    }

    public String getEurro() {
        return eurro;
    }

    public void setEurro(String eurro) {
        this.eurro = eurro;
    }
}