package Dot;

public class Big_List {
    String cod;
    double message;
    int cnt;
    list[] list = new list[6];


    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public double getMessage() {
        return message;
    }

    public void setMessage(double message) {
        this.message = message;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public Dot.list[] getList() {
        return list;
    }

    public void setList(Dot.list[] list) {
        this.list = list;
    }
}