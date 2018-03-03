package Dot;

public class History {
    String message;
    String cod;
    int city_id;
    double calctime;
    int cnt;
    list []list= new list[6];

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public double getCalctime() {
        return calctime;
    }

    public void setCalctime(double calctime) {
        this.calctime = calctime;
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
